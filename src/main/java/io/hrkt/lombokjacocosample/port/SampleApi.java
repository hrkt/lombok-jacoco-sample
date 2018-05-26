package io.hrkt.lombokjacocosample.port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleApi {
    @Autowired
    private SampleFacade sampleFacade;
    
    @GetMapping("{id}")
    public SampleEntityRep get(@RequestParam("id") String id) {
        return sampleFacade.get(id);
    }
}
