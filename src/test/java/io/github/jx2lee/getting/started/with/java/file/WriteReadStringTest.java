package io.github.jx2lee.getting.started.with.java.file;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;

class WriteReadStringTest {

    // given
    WriteReadString writeReadString = new WriteReadString();

    @Test
    @DisplayName("readString: Files")
    void writeTest() throws URISyntaxException {
        // when
        writeReadString.writeTextFile("/Users/nhn/Downloads", "test01.txt");

        // then
    }

    @Test
    @DisplayName("readString: Files")
    void readTest() {
        // when
        String readTxt = writeReadString.readTextFile("file/input", "test01.txt");

        // then
        assertThat(readTxt.replace("\n", "")).isEqualTo("테스트파일입니다.");
    }


}
