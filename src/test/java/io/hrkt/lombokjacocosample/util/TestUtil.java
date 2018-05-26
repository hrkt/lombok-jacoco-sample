package io.hrkt.lombokjacocosample.util;

import io.hrkt.lombokjacocosample.domain.SampleEntity;
import io.hrkt.lombokjacocosample.domain.SampleId;
import lombok.val;

public class TestUtil {
    public static SampleEntity createEntity(SampleId id) {
        val entity = SampleEntity.builder().id(id).intField(123).longField(123L)
                .byteField((byte) 1).charField('a').stringField("str123")
                .build();
        return entity;
    }

    public static SampleEntity createEntity() {
        val id = new SampleId("id0001");
        return createEntity(id);
    }
}
