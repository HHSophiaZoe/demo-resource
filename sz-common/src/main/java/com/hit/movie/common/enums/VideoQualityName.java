package com.hit.movie.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum VideoQualityName {

    x1080P("1080p"),
    x720P("720p"),
    x480P("480p");

    private final String value;

    private static final Map<String, VideoQualityName> mappingValue = new HashMap<>();

    static {
        for (VideoQualityName e : VideoQualityName.values()) {
            mappingValue.put(e.value, e);
        }
    }

    public static VideoQualityName fromValue(String value) {
        return mappingValue.getOrDefault(value, null);
    }

}
