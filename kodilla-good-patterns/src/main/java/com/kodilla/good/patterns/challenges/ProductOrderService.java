package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest);
            System.out.println("Order for " + orderRequest.getUser() + " is accepted");
            return new OrderDto(orderRequest.getUser(), true);
        }
        else {
            System.out.println("There is a problem with the order for " + orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}