package com.example.interview.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UsernameAndPasswordTest {
    @Test
    void shouldCreateObject() {
        UsernameAndPassword actual = new UsernameAndPassword("username1", "changeme");

        assertThat(actual.getUsername()).isEqualTo("username1");
        assertThat(actual.getPassword()).isEqualTo("changeme");
    }
}