package io.hrkt.lombokjacocosample.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SampleEntity {
    private SampleId id;
    private int intField;
    private long longField;
    private String stringField;
    private char charField;
    private byte byteField;
}
