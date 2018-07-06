package com.java6.shop.impl;

import com.java6.shop.api.Item;
import com.java6.shop.api.ItemService;

public class SchoolBagItemServiceImpl implements ItemService {

	Item[] items = new Item[] {
			new Item("Herschel",35),
			new Item("Pier One",40),
			new Item("EastPack",25),
			new Item("Nike",20)
};
	

    @Override
    public Item[] getItems() {
        return items;
    }



}
