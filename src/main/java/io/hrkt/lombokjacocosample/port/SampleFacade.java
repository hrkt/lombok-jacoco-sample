package io.hrkt.lombokjacocosample.port;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import io.hrkt.lombokjacocosample.appSvc.SampleService;
import io.hrkt.lombokjacocosample.domain.SampleEntity;
import io.hrkt.lombokjacocosample.domain.SampleId;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SampleFacade {
    private final SampleService sampleService;

    public List<SampleEntityRep> selectList() {
        return sampleService.selectList().stream()
                .map(rep -> SampleEntityConverter.toSampleEntityRep(rep))
                .collect(Collectors.toList());
    }

    public SampleEntityRep get(String idStr) {
        SampleId id = SampleId.fromString(idStr);
        SampleEntity entity = sampleService.get(id);
        return null == entity ? null : SampleEntityConverter.toSampleEntityRep(entity);
    }

    public void save(SampleEntityRep rep) {
        SampleEntity entity = SampleEntityConverter.toSampleEntity(rep);
        sampleService.save(entity);
    }

}
