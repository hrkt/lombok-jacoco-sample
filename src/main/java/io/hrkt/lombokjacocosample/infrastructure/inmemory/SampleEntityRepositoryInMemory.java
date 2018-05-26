package io.hrkt.lombokjacocosample.infrastructure.inmemory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import io.hrkt.lombokjacocosample.domain.SampleEntity;
import io.hrkt.lombokjacocosample.domain.SampleEntityRepository;
import io.hrkt.lombokjacocosample.domain.SampleId;

@Repository
public class SampleEntityRepositoryInMemory implements SampleEntityRepository {
    private final Map<SampleId, SampleEntity> map = new ConcurrentHashMap<>();
    
    @Override
    public SampleEntity find(SampleId id) {
        return map.get(id);
    }

    @Override
    public void save(SampleEntity entity) {
        map.put(entity.getId(), entity);
    }
}
