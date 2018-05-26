package io.hrkt.lombokjacocosample.domain;

import java.util.List;

public interface SampleEntityRepository {
    List<SampleEntity> selectList();
    
    SampleEntity find(SampleId id);

    void save(SampleEntity entity);
}
