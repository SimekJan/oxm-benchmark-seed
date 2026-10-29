package cz.cuni.mff.simekjan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void starterTest() {
        assertEquals("Hello, World!", App.greeting());
    }
}
