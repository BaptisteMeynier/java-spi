package com.java6.shop;

import com.java6.shop.exception.ProviderNotFoundException;
import com.java6.shop.spi.ShopProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

public final class Shop {

    private static final String DEFAULT_PROVIDER = "com.java6.shop.impl.LibraryItemServiceProvider";

    //All providers
    public static List<ShopProvider> providers(boolean refresh) {
        List<ShopProvider> services = new ArrayList<>();
        ServiceLoader<ShopProvider> loader = ServiceLoader.load(ShopProvider.class);
        if (refresh) {
            loader.reload();
        }
        loader.forEach(services::add);
        return services;
    }

    //Default provider
    public static ShopProvider provider() {
        return provider(DEFAULT_PROVIDER);
    }

    //provider by name
    public static ShopProvider provider(String providerName) {
        ServiceLoader<ShopProvider> loader = ServiceLoader.load(ShopProvider.class);
        Iterator<ShopProvider> it = loader.iterator();
        while (it.hasNext()) {
        	ShopProvider provider = it.next();
            if (providerName.equals(provider.getClass().getName())) {
                return provider;
            }
        }
        throw new ProviderNotFoundException("Exchange Rate provider " + providerName + " not found");
}
}
