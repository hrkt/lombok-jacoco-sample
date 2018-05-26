package io.hrkt.lombokjacocosample.domain;

import java.util.UUID;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SampleId {
    private final String id;

    public static SampleId fromString(String str) {
        return new SampleId(str);
    }

    public static SampleId newId() {
        return new SampleId(UUID.randomUUID().toString());
    }
    
    @Override
    public String toString() {
        return new String(id);
    }
}
