package io.github.jx2lee.getting.started.with.java.enum_example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PlanetTest {
    @Test
    void planetSurfaceWeightTest() {
        // given
        double earthWeight = Double.parseDouble("175");
        double mass = earthWeight / Planet.EARTH.surfaceGravity();

        // when
        double mercuryResult = Planet.MERCURY.surfaceWeight(mass);
        double venusResult = Planet.VENUS.surfaceWeight(mass);
        double earthResult = Planet.EARTH.surfaceWeight(mass);
        double marsResult = Planet.MARS.surfaceWeight(mass);
        double jupiterResult = Planet.JUPITER.surfaceWeight(mass);
        double saturnResult = Planet.SATURN.surfaceWeight(mass);
        double uranusResult = Planet.URANUS.surfaceWeight(mass);
        double neptuneResult = Planet.NEPTUNE.surfaceWeight(mass);

        // then
        Assertions.assertThat(String.format("%f", mercuryResult))
                .isNotNull()
                .isEqualTo("66.107583");

        Assertions.assertThat(String.format("%f", venusResult))
                .isNotNull()
                .isEqualTo("158.374842");

        Assertions.assertThat(String.format("%f", earthResult))
                .isNotNull()
                .isEqualTo("175.000000");

        Assertions.assertThat(String.format("%f", marsResult))
                .isNotNull()
                .isEqualTo("66.279007");

        Assertions.assertThat(String.format("%f", jupiterResult))
                .isNotNull()
                .isEqualTo("442.847567");

        Assertions.assertThat(String.format("%f", saturnResult))
                .isNotNull()
                .isEqualTo("186.552719");

        Assertions.assertThat(String.format("%f", uranusResult))
                .isNotNull()
                .isEqualTo("158.397260");

        Assertions.assertThat(String.format("%f", neptuneResult))
                .isNotNull()
                .isEqualTo("199.207413");


    }
}
