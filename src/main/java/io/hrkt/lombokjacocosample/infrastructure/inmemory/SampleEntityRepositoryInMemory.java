package io.hrkt.lombokjacocosample.infrastructure.inmemory;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import io.hrkt.lombokjacocosample.domain.SampleEntity;
import io.hrkt.lombokjacocosample.domain.SampleEntityRepository;
import io.hrkt.lombokjacocosample.domain.SampleId;

@Repository
public class SampleEntityRepositoryInMemory implements SampleEntityRepository {
    private final Map<SampleId, SampleEntity> map = new ConcurrentHashMap<>();
    
    @Override
    public List<SampleEntity> selectList() {
        return map.values().stream().collect(Collectors.toList());
    }

    @Override
    public SampleEntity find(SampleId id) {
        return map.get(id);
    }

    @Override
    public void save(SampleEntity entity) {
        map.put(entity.getId(), entity);
    }
}
