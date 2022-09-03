package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.models.Cart;
import main.models.Item;

public class CartTest {

    Cart cart;

    @Before
    public void setup() {
        cart = new Cart();
        cart.add(new Item("Pepsi", 1.99));
        cart.add(new Item("Crush", 1.99));
    }
    
    @Test
    public void itemAddedTest() {
        assertTrue(cart.contains(new Item("Crush", 1.99)));
    }

    @Test
    public void skipDuplicate() {
        assertFalse(cart.add(new Item("Crush", 1.99)));
    }

    @Test
    public void removedItemTest() {
        cart.remove("Crush");
        assertFalse(cart.contains(new Item("Crush", 1.99)));
    }

    @Test
    public void subtotalIsValid() {
        assertEquals(3.98, cart.getSubtotal());
    }

    @Test
    public void taxIsValid() {
        assertEquals(3.9, cart.getTax(30.0));
    }

    @Test
    public void totalIsValid() {
        assertEquals(33.9, cart.getTotal(30.0, 3.9));
    }

    @Test(expected = IllegalStateException.class)
    public void invalidRemoveState() {
        cart.clear();
        cart.remove("Crush");
    }

    @Test(expected = IllegalStateException.class)
        public void invalidCheckoutState() {
            cart.clear();
            cart.checkout();
    }

}