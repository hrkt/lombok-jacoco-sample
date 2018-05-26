package io.hrkt.lombokjacocosample.port;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import io.hrkt.lombokjacocosample.util.TestUtil;
import lombok.val;

public class SampleEntityConverterTest {

    @Test
    public void convert_success() {
        val entity = TestUtil.createEntity();
        val rep = SampleEntityConverter.toSampleEntityRep(entity);
        assertThat(SampleEntityConverter.toSampleEntity(rep)).isEqualTo(entity);
    }

    @Test
    public void convert_with_no_id_success() {
        val entity = TestUtil.createEntity();
        val rep = SampleEntityConverter.toSampleEntityRep(entity);
        entity.setId(null);
        rep.setId(null);
        assertThat(SampleEntityConverter.toSampleEntity(rep)).isEqualTo(entity);
    }
}
