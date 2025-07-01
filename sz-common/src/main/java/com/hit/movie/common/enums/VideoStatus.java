package com.hit.movie.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VideoStatus {

    UPLOADED("UPLOADED"),
    PROCESSING("PROCESSING"),
    PROCESSED("PROCESSED"),
    PROCESS_FAILED("PROCESS_FAILED");

    private final String value;

}
