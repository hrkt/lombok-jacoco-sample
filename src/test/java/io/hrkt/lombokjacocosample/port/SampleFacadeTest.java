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

import io.hrkt.lombokjacocosample.appSvc.SampleService;
import io.hrkt.lombokjacocosample.domain.SampleEntity;
import io.hrkt.lombokjacocosample.domain.SampleId;
import io.hrkt.lombokjacocosample.util.TestUtil;
import lombok.val;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class SampleFacadeTest {
    @InjectMocks
    SampleFacade sampleFacade;

    @Mock
    SampleService sampleService;

    @Test
    public void get_success() {
        val id = SampleId.fromString("id1");
        val entity = TestUtil.createEntity(id);
        when(sampleService.get(id)).thenReturn(entity);
        val rep = SampleEntityConverter.toSampleEntityRep(entity);
        assertThat(sampleFacade.get("id1")).isEqualTo(rep);
    }

    @Test
    public void get_noresponse_success() {
        val id = SampleId.fromString("id1");
        val entity = TestUtil.createEntity(id);
        when(sampleService.get(id)).thenReturn(null);
        assertThat(sampleFacade.get("id1")).isEqualTo(null);
    }

    @Test
    public void save_success() {
        val id = SampleId.fromString("id1");
        val entity = TestUtil.createEntity(id);
        val rep = SampleEntityConverter.toSampleEntityRep(entity);
        doNothing().when(sampleService).save(entity);
        sampleFacade.save(rep);
    }

    @Test
    public void select_success() {
        val id = SampleId.fromString("id1");
        val entity = TestUtil.createEntity(id);
        val list = new ArrayList<SampleEntity>();
        list.add(entity);
        when(sampleService.selectList()).thenReturn(list);
        val rep = SampleEntityConverter.toSampleEntityRep(entity);
        assertThat(sampleFacade.selectList().get(0)).isEqualTo(rep);
    }
}