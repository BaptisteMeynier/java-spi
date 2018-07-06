package com.java6.shop.impl;

import com.java6.shop.api.Item;
import com.java6.shop.api.ItemService;

public class LuggagesItemServiceImpl implements ItemService {

    Item[] items = new Item[]{
            new Item("Roncato", 120),
            new Item("Delsey", 250),
            new Item("Hermes", 580)
    };

    @Override
    public Item[] getItems() {
        return items;
    }

}
