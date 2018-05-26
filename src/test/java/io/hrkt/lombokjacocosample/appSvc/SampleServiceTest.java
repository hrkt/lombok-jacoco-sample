package io.hrkt.lombokjacocosample.appSvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import io.hrkt.lombokjacocosample.domain.SampleEntity;
import io.hrkt.lombokjacocosample.domain.SampleEntityRepository;
import io.hrkt.lombokjacocosample.domain.SampleId;
import io.hrkt.lombokjacocosample.util.TestUtil;
import lombok.val;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class SampleServiceTest {
    @InjectMocks
    SampleService sampleService;

    @Mock
    SampleEntityRepository sampleEntityRepository;

    @Test
    public void selectList_success() {
        val ret = new ArrayList<SampleEntity>();
        val entity = TestUtil.createEntity();
        ret.add(entity);
        when(sampleEntityRepository.selectList()).thenReturn(ret);

        val actual = sampleService.selectList();
        assertThat(Arrays.equals(actual.toArray(), ret.toArray())).isTrue();
    }

    @Test
    public void find_success() {
        val ret = new ArrayList<SampleEntity>();
        val id = new SampleId("id0001");
        val entity = TestUtil.createEntity(id);
        ret.add(entity);
        when(sampleEntityRepository.find(id)).thenReturn(entity);

        assertThat(sampleService.get(id)).isEqualTo(entity);
    }

    @Test
    public void save_success() {
        val entity = TestUtil.createEntity();
        doNothing().when(sampleEntityRepository).save(entity);

        sampleService.save(entity);

        verify(sampleEntityRepository, times(1)).save(entity);
    }
}
