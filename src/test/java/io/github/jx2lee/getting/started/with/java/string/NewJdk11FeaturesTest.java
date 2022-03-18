package io.github.jx2lee.getting.started.with.java.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class NewJdk11FeaturesTest {

    // given
    NewJdk11Features newJdk11Features = new NewJdk11Features();

    @Test
    @DisplayName("isBlank: 공백으로 이루어진 문자를 확인한다")
    void isBlank() {
        // when
        boolean nonBlank = newJdk11Features.blankInString("nnn");
        boolean blank = newJdk11Features.blankInString("      ");

        // then
        Assertions.assertFalse(nonBlank);
        Assertions.assertTrue(blank);
    }

    @Test
    @DisplayName("lines: \\n을 포함한 문자열을 라인 단위로 나눠 stream 으로 반환한다")
    void linesTest() {
        // when
        Stream<String> streamByLine = newJdk11Features.getStreamByLine();
        List<String> stringByLineList = streamByLine.filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());

        // then
        assertThat(stringByLineList)
                .isNotEmpty()
                .containsExactly("jx2lee helps", "developers", "explore Java.");
        stringByLineList.forEach(s -> System.out.println(s));
    }

    @Test
    @DisplayName("repeat: strip: stripLeading: stripTrailing")
    void stripTest() {
        // when
        String repeatString = newJdk11Features.repeatString("1", 5);
        String stripString = newJdk11Features.stripString(" 1 ");
        String stripStringLeading = newJdk11Features.stripStringLeading(" 1");
        String stripStringTrailing = newJdk11Features.stripStringTrailing("1 ");

        // then
        assertThat(repeatString).isEqualTo("11111");
        assertThat(stripString).isEqualTo("1");
        assertThat(stripStringLeading).isEqualTo("1");
        assertThat(stripStringTrailing).isEqualTo("1");
    }
}
