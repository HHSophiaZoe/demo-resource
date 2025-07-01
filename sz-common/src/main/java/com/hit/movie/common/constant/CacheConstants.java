package com.hit.movie.common.constant;

import com.hit.cache.util.CacheUtils;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CacheConstants {

    // =============== Cache name ===============
    public static final String VIDEO_CACHE = "VIDEO_CACHE";

    // =============== Cache key prefix ===============
    private static final String VIDEO_CHUNKS_KEY_PREFIX = "VIDEO_CHUNKS";

    public static String getVideoChunksKey(String id) {
        return CacheUtils.buildCacheKey(VIDEO_CHUNKS_KEY_PREFIX, id);
    }

}
