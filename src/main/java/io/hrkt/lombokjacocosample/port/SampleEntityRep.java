package io.hrkt.lombokjacocosample.port;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SampleEntityRep {
    private String id;
    private int intField;
    private long longField;
    private String stringField;
    private char charField;
    private byte byteField;
}
