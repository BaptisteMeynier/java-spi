package com.shop.app;

import com.java6.shop.Shop;
import com.java6.shop.api.Item;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class AppTest {

    @Test
    public void should_get_all_provider(){
        Assert.assertTrue(Shop.providers().size()>1);
        Shop.providers().forEach(shopProvider -> System.out.println(shopProvider.getClass().getName()));
    }

    @Test
    public void should_get_library_provider(){
        Item[] items = Shop.provider().create().getItems();
        System.out.println("----------------------------------------");
        Arrays.asList(items).forEach(item -> System.out.println("Item --> " + item.getName() + " : " + item.getPrice()));
        Assert.assertTrue(Shop.provider().getClass().getName().contains("Library"));
    }

}
