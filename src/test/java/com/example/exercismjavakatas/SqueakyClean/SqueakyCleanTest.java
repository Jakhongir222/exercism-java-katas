package com.example.exercismjavakatas.SqueakyClean;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SqueakyCleanTest {

    @Test
    void shouldChangeTheWhiteSpaceToUnderscores (){
        assertThat(SqueakyClean.clean("my   Id")).isEqualTo("my___Id");
    }

}
