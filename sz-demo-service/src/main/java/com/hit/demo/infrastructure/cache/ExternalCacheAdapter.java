package com.hit.demo.infrastructure.cache;

import com.hit.cache.store.external.RedisCacheStoreImpl;
import com.hit.demo.shared.cache.ExternalCacheStore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = {"cache.external.enable"}, havingValue = "true")
public class ExternalCacheAdapter extends RedisCacheStoreImpl implements ExternalCacheStore {

}
