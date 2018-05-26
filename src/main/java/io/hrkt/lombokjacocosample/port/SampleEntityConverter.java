package io.hrkt.lombokjacocosample.port;

import java.lang.reflect.Field;

import org.springframework.beans.BeanUtils;
import org.springframework.util.ReflectionUtils;

import io.hrkt.lombokjacocosample.domain.SampleEntity;
import io.hrkt.lombokjacocosample.domain.SampleId;

public class SampleEntityConverter {
    public static SampleEntityRep toSampleEntityRep(SampleEntity entity) {
        SampleEntityRep rep = new SampleEntityRep();
        BeanUtils.copyProperties(entity, rep);
        Field field = ReflectionUtils.findField(SampleEntityRep.class, "id");
        field.setAccessible(true);
        ReflectionUtils.setField(field, rep, entity.getId().toString());
        return rep;
    }

    public static SampleEntity toSampleEntity(SampleEntityRep rep) {
        SampleEntity entity = new SampleEntity();
        BeanUtils.copyProperties(rep, entity);
        if(null != rep.getId()) {
            entity.setId(SampleId.fromString(rep.getId()));
        }
        return entity;
    }
}
