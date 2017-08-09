/*package com.cdk.shop;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by badkass on 8/2/2017.
 */
/*public class ShoppingCartServiceTest {

    ShoppingCartService scs = null;
    Product product = null;

    @Before
    public void init(){
        scs = new ShoppingCartService();
        Product p1 = new Product(345L,"Mobile",345345.00,3);
        Product p2 = new Product(235L,"Headphones",34545.00,3);
        Product p3 = new Product(565L,"Coffee Powder",2364.00,3);
        Product p4 = new Product(235L,"Router",34535.00,3);
        Product p5 = new Product(678L,"Apple",345345.00,3);
        scs.cart.put(34L,p1);
        scs.cart.put(84L,p2);
        scs.cart.put(89L,p3);
        scs.cart.put(23L,p4);
        scs.cart.put(10L,p5);
    }

    @After
    public void cleanup() {
        scs = null;
    }

    @Test
    public void addItemTest() {
        int currentQuantity = scs.countItems();
        scs.addItem(new Product(234L,"Bottle",435.00,7));
        Assert.assertTrue(scs.cart.containsKey(234L));
        Assert.assertEquals(currentQuantity+7,scs.countItems());
    }

    @Test
    public void addExistingItemTest() {
        Product existingProduct = scs.cart.get(34L);
        System.out.println(scs.cart);
        int currentQuantity = existingProduct.getQty();
        scs.addItem(new Product(345L,"Mobile",345345.00,3));
        Assert.assertEquals(currentQuantity+1,scs.cart.get(234L).getQty());
    }

    @Test
    public void countItemTest() {
        Assert.assertEquals(15,scs.countItems());
    }

  //  @Test
}
*/