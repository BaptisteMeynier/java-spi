package com.java6.shop.spi;

import com.java6.shop.api.ItemManager;

public interface ShopProvider {
	ItemManager create();
}
