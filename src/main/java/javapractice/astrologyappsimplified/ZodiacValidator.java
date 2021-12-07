package javapractice.astrologyappsimplified;

public class ZodiacValidator {
    public boolean isZodiac(String input) {
        String cleanInput = input.toLowerCase();
        if(cleanInput.equals("aquarius")) {
            return true;
        } else if (cleanInput.equals( "pisces")) {
            return true;
        } else if (cleanInput.equals("aries")) {
            return true;
        } else if (cleanInput.equals("taurus")) {
            return true;
        } else if (cleanInput.equals("gemini")) {
            return true;
        } else if (cleanInput.equals("cancer")) {
            return true;
        } else if (cleanInput.equals("leo")) {
            return true;
        } else if (cleanInput.equals("virgo")) {
            return true;
        } else if (cleanInput.equals("libra")) {
            return true;
        } else if (cleanInput.equals("scorpio")) {
            return true;
        } else if (cleanInput.equals("sagittarius")) {
            return true;
        } else if (cleanInput.equals("capricorn")) {
            return true;
        } else {
            return false;
        }
    }
}
