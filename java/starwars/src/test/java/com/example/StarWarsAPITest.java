package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class StarWarsAPITest {
    
    @Test
    public void testGetLukeSkywalker() throws Exception {
        // Given
        StarWarsAPI api = new StarWarsAPIImpl();

        // When
        StarWarsCharacterDTO luke = api.getLukeSkywalker();

        // Then
        assertNotNull("Character should not be null", luke);
        assertEquals("Name should be Luke Skywalker", "Luke Skywalker", luke.getName());
        assertEquals("Height should be 172", "172", luke.getHeight());
        assertEquals("Mass should be 77", "77", luke.getMass());
        assertEquals("Hair color should be blond", "blond", luke.getHairColor());
        assertEquals("Eye color should be blue", "blue", luke.getEyeColor());
        assertEquals("Birth year should be 19BBY", "19BBY", luke.getBirthYear());
        assertNotNull("Films list should not be null", luke.getFilms());
        assertFalse("Films list should not be empty", luke.getFilms().isEmpty());
    }

    @Test
    public void testGetDarthVader() throws Exception {
        // Given
        StarWarsAPI api = new StarWarsAPIImpl();

        // When
        StarWarsCharacterDTO vader = api.getDarthVader();

        // Then
        assertNotNull("Character should not be null", vader);
        assertEquals("Name should be Darth Vader", "Darth Vader", vader.getName());
        assertEquals("Height should be 202", "202", vader.getHeight());
        assertEquals("Mass should be 136", "136", vader.getMass());
        assertEquals("Hair color should be none", "none", vader.getHairColor());
        assertEquals("Eye color should be yellow", "yellow", vader.getEyeColor());
        assertEquals("Birth year should be 41.9BBY", "41.9BBY", vader.getBirthYear());
        assertNotNull("Films list should not be null", vader.getFilms());
        assertFalse("Films list should not be empty", vader.getFilms().isEmpty());
    }
}