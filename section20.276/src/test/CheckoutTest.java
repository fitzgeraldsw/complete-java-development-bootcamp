package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.Main;

public class CheckoutTest {
    @Test
    public void subtotalIsValid() {
        assertEquals(19.2, Main.getSubtotal());
    }

    @Test
    public void taxIsValid() {
        assertEquals(3.9, Main.getTax(30.0));
    }

    @Test
    public void totalIsValid() {
        assertEquals(113.0, Main.getTotal(100.0, 13.0));
    }
}
