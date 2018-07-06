package com.java6.shop.impl;

import com.java6.shop.api.ItemService;
import com.java6.shop.spi.ShopProvider;

public class FruitItemServiceProvider implements ShopProvider {
    @Override
    public ItemService create() {
        return new FruitItemServiceImpl();
    }
}
