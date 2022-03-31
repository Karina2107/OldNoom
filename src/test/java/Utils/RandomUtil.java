package Utils;

import java.util.Random;

public class RandomUtil {
    private static final String DICT = "АБВГДЕЖЗИКабвгдежзик0123456789";
    private static Random random = new Random();

    public static String generate(int length) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        for ( ; length > 0; --length )
            sb.append(DICT.charAt(random.nextInt(DICT.length())));
        return sb.toString();
    }
    public static int generateNumber(int length){
        return  random.nextInt(length);
    }
}

