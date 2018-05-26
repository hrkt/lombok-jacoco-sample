package io.hrkt.lombokjacocosample.domain;

public interface SampleEntityRepository {
    SampleEntity find(SampleId id);
    void save(SampleEntity entity);
}
