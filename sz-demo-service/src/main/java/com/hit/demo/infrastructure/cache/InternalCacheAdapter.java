package com.hit.demo.infrastructure.cache;

import com.hit.cache.store.internal.CaffeineCacheStoreImpl;
import com.hit.demo.shared.cache.InternalCacheStore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = {"cache.internal.enable"}, havingValue = "true")
public class InternalCacheAdapter extends CaffeineCacheStoreImpl implements InternalCacheStore {

}
