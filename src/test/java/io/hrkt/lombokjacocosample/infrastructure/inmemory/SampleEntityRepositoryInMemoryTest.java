package io.hrkt.lombokjacocosample.infrastructure.inmemory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import io.hrkt.lombokjacocosample.domain.SampleEntity;
import io.hrkt.lombokjacocosample.domain.SampleId;
import lombok.val;

public class SampleEntityRepositoryInMemoryTest {

    @Test
    public void test() {
        val repository = new SampleEntityRepositoryInMemory();
        val id = new SampleId("id0001");
        SampleEntity entity = SampleEntity.builder().id(id).intField(123).longField(123L)
                .byteField((byte) 1).charField('a').stringField("str123")
                .build();
        repository.save(entity);
        
        assertThat(repository.selectList().get(0)).isEqualTo(entity);
        assertThat(repository.find(id)).isEqualTo(entity);
    }

}
