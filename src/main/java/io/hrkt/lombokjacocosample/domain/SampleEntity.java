package io.hrkt.lombokjacocosample.domain;

import lombok.Data;

@Data
public class SampleEntity {
    private SampleId id;
    private int intField;
    private long longField;
    private String stringField;
    private char charField;
    private byte byteField;
}
