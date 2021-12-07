package javapractice.astrologyappsimplified;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FlowControlTest {
    private IZodiacValidator _zodiacValidator;
    private IZodiac _zodiac;
    private IFlowControl _flowControl;

    @BeforeEach
    public void setup() {
        this._zodiacValidator = mock(ZodiacValidator.class);
        this._zodiac = mock(Zodiac.class);
        this._flowControl = new FlowControl(_zodiacValidator, _zodiac);
    }

    @Test
    public void givenAquariusCallIsZodiacOnce() {
        // Given: I am a user
        // When: I enter the string "Aquarius"
        when(_zodiacValidator.isZodiac("aquarius")).thenReturn(true);
        _flowControl.run("aquarius");
        // Then: Call isZodiac() once
        verify(_zodiacValidator, times(1)).isZodiac("aquarius");
    }

    @Test
    public void givenAquariusCallZodiacOnce() {
        // Given: I am a user
        when(_zodiacValidator.isZodiac("aquarius")).thenReturn(true);
        when(_zodiac.generateTraits("aquarius")).thenReturn(anyString());
        _flowControl.run("aquarius");
        // When: I enter the string "Aquarius"
        // Then: Call Zodiac() once
        verify(_zodiac, times(1)).generateTraits("aquarius");
    }

    @Test
    public void givenBobCallIsZodiac() {
        // Given: I am a user
        // When: I enter the string "Bob"
        when(_zodiacValidator.isZodiac("bob")).thenReturn(false);
        _flowControl.run("bob");
        // Then: Call isZodiac() once
        verify(_zodiacValidator,times(1)).isZodiac("bob");
    }

    @Test
    public void givenBobDoNotCallZodiac() {
        // Given: I am a user
        // When: I enter the string "Bob"
        when(_zodiac.generateTraits(anyString())).thenReturn(anyString());
        _flowControl.run("bob");
        // Then: Call Zodiac() zero times
        verify(_zodiac, never()).generateTraits(anyString());
    }
}