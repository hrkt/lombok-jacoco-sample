package io.hrkt.lombokjacocosample.port;

import org.springframework.beans.BeanUtils;

import io.hrkt.lombokjacocosample.domain.SampleEntity;

public class SampleEntityConverter {
    public static SampleEntityRep toSampleEntityRep(SampleEntity entity) {
        SampleEntityRep rep = new SampleEntityRep();
        BeanUtils.copyProperties(entity, rep);
        return rep;
    }
}
