package shoppingCart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.*;

public class TestUnit {

    ShoppingCart sc = new ShoppingCart();

    @Test
    public void testCreateCart() {
        ShoppingCart sc = new ShoppingCart();
        assertEquals(0, sc.getItemCount());
    }

    @Test
    public void testEmpty() {
        sc.addItem(new Product("pizza", 10));
        sc.empty();
        assertEquals(0, sc.getItemCount());
    }

    @Before
    public void addItemss() {
        sc.addItem(new Product("pizza", 10));
        sc.addItem(new Product("birra", 5));
    }

    @Test
    public void addNumberItems() {
        assertEquals(2, sc.getItemCount());
    }

    @Test
    public void checkBalance() {
        sc.addItem(new Product("birra", 5));
        assertEquals(20, sc.getBalance(), 0);
    }

    @Test
    public void testRemoveItems() throws ProductNotFoundException {
        Product pd = new Product("droga", 10);
        sc.addItem(pd);
        sc.removeItem(pd);
        assertEquals(2, sc.getItemCount());
    }

    @Test
    public void testRemoveError() {
        try {

            sc.removeItem(new Product("ciao", 10));
            fail("Prodotto non presente");
        } catch (ProductNotFoundException e) {
            // TODO: handle exception
            System.out.println("Sono dentro catch");
        }
    }
}
