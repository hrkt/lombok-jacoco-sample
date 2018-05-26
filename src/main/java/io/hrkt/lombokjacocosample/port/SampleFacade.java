package io.hrkt.lombokjacocosample.port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.hrkt.lombokjacocosample.appSvc.SampleService;
import io.hrkt.lombokjacocosample.domain.SampleEntity;
import io.hrkt.lombokjacocosample.domain.SampleId;

@Component
public class SampleFacade {
    @Autowired
    private SampleService sampleService;
    
    public SampleEntityRep get(String idStr) {
        SampleId id = SampleId.fromString(idStr);
        SampleEntity entity = sampleService.get(id);
        return SampleEntityConverter.toSampleEntityRep(entity);
    }
}
