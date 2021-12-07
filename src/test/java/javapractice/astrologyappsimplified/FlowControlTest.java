package javapractice.astrologyappsimplified;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

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
        // When: I enter the string Aquarius
        // Then: Call isZodiac() once

    }

}