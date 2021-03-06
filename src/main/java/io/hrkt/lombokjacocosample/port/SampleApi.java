package io.hrkt.lombokjacocosample.port;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class SampleApi {
    private final SampleFacade sampleFacade;
    
    @GetMapping
    public List<SampleEntityRep> select() {
        return sampleFacade.selectList();
    }

    @GetMapping("/{id}")
    public SampleEntityRep get(@PathVariable("id") String id) {
        return sampleFacade.get(id);
    }
    
    @PostMapping
    public void save(@RequestBody SampleEntityRep rep) {
        sampleFacade.save(rep);
    }
}
