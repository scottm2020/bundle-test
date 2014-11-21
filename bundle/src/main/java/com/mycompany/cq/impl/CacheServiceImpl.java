package com.mycompany.cq.impl;


import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.mycompany.cq.CacheService;

@Service(CacheService.class)
@Component(
        label = "Cache Service", metatype = true, immediate = true)
public class CacheServiceImpl implements CacheService
{
    private transient Cache<String, Object> cache;

    @Activate
    public final void activate()
    {
        cache = CacheBuilder.newBuilder().build();
    }

    public final Object get(final String key)
    {
        return cache.getIfPresent(key);
    }

    public final void put(final String key, final Object value)
    {
        cache.put(key, value);
    }

}
