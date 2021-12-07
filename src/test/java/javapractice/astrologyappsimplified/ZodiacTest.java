package javapractice.astrologyappsimplified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZodiacTest {
    @Test
    public void givenAquariusGetProgressiveOriginalIndependentHumanitarian() {
        Zodiac zodiac = new Zodiac();
        // Given: I am a user
        String result = zodiac.generateTraits("aquarius");
        // When: I enter the string "aquarius"
        assertEquals("Progressive, original, independent, humanitarian", result);
        // Then: The string "Progressive, original, independent, humanitarian" is returned
    }

    @Test
    public void givenLeoGetCreativePassionateGenerousWarmHeartedCheerfulHumorous() {
        Zodiac zodiac = new Zodiac();
        // Given: I am a user
        String result = zodiac.generateTraits("leo");
        // When: I enter the string "leo"
        assertEquals("Creative, passionate, generous, warm-hearted, cheerful, humorous", result);
        // Then: The string "Creative, passionate, generous, warm-hearted, cheerful, humorous" is returned
    }

    @Test
    public void givenCapricornGetCreativePassionateGenerousWarmHeartedCheerfulHumorous() {
        Zodiac zodiac = new Zodiac();
        // Given: I am a user
        String result = zodiac.generateTraits("capricorn");
        // When: I enter the string "capricorn"
        assertEquals("Responsible, disciplined, self-control, good managers", result);
        // Then: The string "Responsible, disciplined, self-control, good managers" is returned
    }

}