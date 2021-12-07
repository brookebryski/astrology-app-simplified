package javapractice.astrologyappsimplified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZodiacValidatorTest {
    @Test
    public void givenAquariusGetTrue() {
        // Given: I am a user
        ZodiacValidator zv = new ZodiacValidator();
        // When: I enter the string "aquarius"
        boolean isZodiac = zv.isZodiac("aquarius");
        // Then: I get back "true"
        assertTrue(isZodiac);
    }

    @Test
    public void givenLeoGetTrue() {
        // Given: I am a user
        ZodiacValidator zv = new ZodiacValidator();
        // When: I enter the string "leo"
        boolean isZodiac = zv.isZodiac("leo");
        // Then: I get back "true"
        assertTrue(isZodiac);
    }

    @Test
    public void givenCapitalCapricornGetTrue() {
        // Given: I am a user
        ZodiacValidator zv = new ZodiacValidator();
        // When: I enter the string "Capricorn" with a capital "C"
        boolean isZodiac = zv.isZodiac("Capricorn");
        // Then: I get back "true"
        assertTrue(isZodiac);
    }

    @Test
    public void givenBobGetFalse() {
        // Given: I am a user
        ZodiacValidator zv = new ZodiacValidator();
        // When: I enter the string "bob"
        boolean isZodiac = zv.isZodiac("Bob");
        // Then: I get back "false"
        assertFalse(isZodiac);
    }
}