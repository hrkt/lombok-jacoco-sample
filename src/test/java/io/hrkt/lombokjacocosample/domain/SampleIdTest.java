package io.hrkt.lombokjacocosample.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.stream.IntStream;

import org.junit.Test;

import lombok.val;

public class SampleIdTest {

    @Test
    public void toString_success() {
        val id1 = new SampleId("id1"); 
        assertThat(id1.toString()).isEqualTo("id1");
    }

    @Test
    public void fromString_success() {
        val id1 = new SampleId("id1"); 
        val id2 = SampleId.fromString("id1"); 
        assertThat(id2).isEqualTo(id1);
    }

    @Test
    public void newId_success() {
        val max = 1000;
        val ids = new HashSet<>();
        IntStream.range(0, max).forEach(i -> {
            ids.add(SampleId.newId());
        });
        assertThat(ids.size()).isEqualTo(max);
    }
}
