package nl.ryanaelen.DEA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthCheckResourceTest {

    @Test
    public void returnIsCorrectString() {
        var sut = new HealthCheckResource();
        assertEquals("Up & Running", sut.healthy());
    }
}