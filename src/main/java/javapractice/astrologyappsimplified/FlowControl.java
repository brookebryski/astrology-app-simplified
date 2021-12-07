package javapractice.astrologyappsimplified;

public class FlowControl implements IFlowControl {
    private IZodiacValidator _zodiacValidator;
    private IZodiac _zodiac;

    public FlowControl(IZodiacValidator zodiacValidator, IZodiac zodiac) {
        this._zodiacValidator = zodiacValidator;
        this._zodiac = zodiac;
    }

    public void run(String input) {
        if(_zodiacValidator.isZodiac(input)) {
            String result = _zodiac.generateTraits(input);
            System.out.println(result);
        }
    }
    // System.out.println("Please enter a valid zodiac sign.");
    }
