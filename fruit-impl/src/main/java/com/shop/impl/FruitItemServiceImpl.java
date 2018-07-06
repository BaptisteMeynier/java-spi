package com.shop.impl;

import com.java6.shop.api.Item;
import com.java6.shop.api.ItemService;

public class FruitItemServiceImpl implements ItemService {

	Item[] items = new Item[] {
			new Item("Banana",1),
			new Item("Ananas",5),
			new Item("Strawberry",3),
			new Item("Peach",4)
};
	

    @Override
    public Item[] getItems() {
        return items;
    }

}
