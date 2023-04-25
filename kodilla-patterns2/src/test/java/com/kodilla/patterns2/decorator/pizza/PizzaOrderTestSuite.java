package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testCapriciosaGetCost(){
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CapriciosaOrder(theOrder);
        //when
        BigDecimal theCOst = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(20),theCOst);

    }

    @Test
    public void testProsciuttoGetDescripotion(){
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ProsciuttoOrder(theOrder);
        //when
        String description = theOrder.getIngredients();
        //then
        assertEquals("Pizza: sos pomidorowy,ser, rukola, szynka parmeńska,parmezan",description);
    }


    @Test
    public void testHawianPizzaWithExtraCheeseGetCost(){
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaianOrder(theOrder);
        theOrder = new ExtraCheese(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(21),theCost);
    }

}