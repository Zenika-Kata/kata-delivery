package com.github.zenikakata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseTest {
    @Test
    void should_be_OK() {
        assertThat(1 + 1).isEqualTo(2);
    }

    @Test
    void should_be_KO() {
        assertThat(1 - 1).isEqualTo(-1);
    }
}
