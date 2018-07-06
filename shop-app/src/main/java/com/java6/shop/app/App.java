package com.java6.shop.app;

import com.java6.shop.Shop;
import com.java6.shop.api.Item;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        Shop.providers(true).forEach(provider -> {
            System.out.println("Retreiving items from provider :" + provider);
            Item [] items = provider.create().getItems();
            System.out.println("----------------------------------------");
            Arrays.asList(items).forEach(item -> System.out.println("Item --> " + item.getName() + " : " + item.getPrice()));
        });

    }
}
