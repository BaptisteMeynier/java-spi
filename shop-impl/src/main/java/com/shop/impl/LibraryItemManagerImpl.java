package com.shop.impl;

import com.java6.shop.api.Item;
import com.java6.shop.api.ItemManager;

public class LibraryItemManagerImpl implements ItemManager {

	Item[] items = new Item[] {
			new Item("Book1",12),
			new Item("Book2",10),
			new Item("Book3",5),
			new Item("Book4",6)
};
	

    @Override
    public Item[] getItems() {
        return items;
    }



}
