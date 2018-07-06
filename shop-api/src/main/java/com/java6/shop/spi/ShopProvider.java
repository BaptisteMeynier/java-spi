package com.java6.shop.spi;

import com.java6.shop.api.ItemService;

public interface ShopProvider {
	ItemService create();
}
