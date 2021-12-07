package javapractice.astrologyappsimplified;

public class Zodiac implements IZodiac{
    public String generateTraits(String zodiac) {
        switch (zodiac) {
            case "aquarius":
                return "Progressive, original, independent, humanitarian";
            case "pisces":
                return "Compassionate, artistic, intuitive, gentle, wise, musical";
            case "aries":
                return "Courageous, determined, confident, enthusiastic, optimistic, honest, passionate";
            case "taurus":
                return "Reliable, patient, practical, devoted, responsible, stable";
            case "gemini":
                return "Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas";
            case "cancer":
                return "Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive";
            case "leo":
                return "Creative, passionate, generous, warm-hearted, cheerful, humorous";
            case "virgo":
                return "Loyal, analytical, kind, hardworking, practical";
            case "libra":
                return "Cooperative,diplomatic, gracious, fair-minded, social";
            case "scorpio":
                return "Resourceful, powerful, brave, passionate, a true friend";
            case "sagittarius":
                return "Generous, idealistic, great sense of humor";
            default:
                return "Responsible, disciplined, self-control, good managers";
        }
    }
}
