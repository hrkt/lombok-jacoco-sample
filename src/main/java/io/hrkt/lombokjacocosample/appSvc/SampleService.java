package io.hrkt.lombokjacocosample.appSvc;

import org.springframework.stereotype.Service;

import io.hrkt.lombokjacocosample.domain.SampleEntity;
import io.hrkt.lombokjacocosample.domain.SampleEntityRepository;
import io.hrkt.lombokjacocosample.domain.SampleId;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleService {
    private final SampleEntityRepository sampleEntityRepository;
    public SampleEntity get(SampleId id) {
        return sampleEntityRepository.find(id);
    }
    public void save(SampleEntity entity) {
        sampleEntityRepository.save(entity);
    }
}
