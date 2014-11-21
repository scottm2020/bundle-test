package com.mycompany.cq;

public interface CacheService
{
    Object get(String key);
    
    void put(final String key, final Object value);
}
