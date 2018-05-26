package io.hrkt.lombokjacocosample.port;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import io.hrkt.lombokjacocosample.domain.SampleId;
import io.hrkt.lombokjacocosample.util.TestUtil;
import lombok.val;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class SampleApiTest {
    @InjectMocks
    SampleApi sampleApi;

    @Mock
    SampleFacade sampleFacade;
    
    @Test
    public void get_success() {
        val id = SampleId.fromString("id1");
        val entity = TestUtil.createEntity(id);
        val rep = SampleEntityConverter.toSampleEntityRep(entity);
        when(sampleFacade.get(id.toString())).thenReturn(rep);
        assertThat(sampleApi.get("id1")).isEqualTo(rep);
    }

    @Test
    public void save_success() {
        val id = SampleId.fromString("id1");
        val entity = TestUtil.createEntity(id);
        val rep = SampleEntityConverter.toSampleEntityRep(entity);
        doNothing().when(sampleFacade).save(rep);
        sampleApi.save(rep);
    }
    
    @Test
    public void select_success() {
        val id = SampleId.fromString("id1");
        val entity = TestUtil.createEntity(id);
        val rep = SampleEntityConverter.toSampleEntityRep(entity);
        val list = new ArrayList<SampleEntityRep>();
        list.add(rep);
        when(sampleFacade.selectList()).thenReturn(list);
        assertThat(sampleApi.select()).isEqualTo(list);
    }
}
