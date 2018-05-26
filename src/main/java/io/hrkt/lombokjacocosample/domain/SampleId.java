package io.hrkt.lombokjacocosample.domain;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class SampleId {
    private final String id;
    public static SampleId fromString(String str) {
        return new SampleId(str);
    }
}
