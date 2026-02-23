package org.example.fiveKyu;

public class RGBToHex {

    public static String numberConverter(int i) {
        String result = "";
        if (i < 0) {
            i = 0;
        } else if (i > 255) {
            i = 255;
        }
        result = Integer.toString(i, 16);
        if (result.length() == 1) {
            result = "0" + result;
        }
        return result;
    }

    public static String rgbToHexConverter(int r, int g, int b) {
        StringBuilder result = new StringBuilder();
        result.append(numberConverter(r) + numberConverter(g) + numberConverter(b));
        return result.toString().toUpperCase();
    }
}
