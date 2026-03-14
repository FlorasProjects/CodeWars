package org.example.fiveKyu;

/*
How can you tell an extrovert from an introvert at NSA?
Va gur ryringbef, gur rkgebireg ybbxf ng gur BGURE thl'f fubrf.

I found this joke on USENET, but the punchline is scrambled. Maybe you can decipher it?
According to Wikipedia, ROT13 is frequently used to obfuscate jokes on USENET.

For this task you're only supposed to substitute characters. Not spaces, punctuation, numbers, etc.

Test examples:

"EBG13 rknzcyr." -> "ROT13 example."

"This is my first ROT13 excercise!" -> "Guvf vf zl svefg EBG13 rkprepvfr!"

 */
public class Rot13 {

    public static char rot13(char input) {
        return (char) (input + 13);
    }

    public static String rot13(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z')) {
                result.append(c);
                continue;
            }
            if ((c + 13) > 'z' && Character.isLowerCase(c)) {
                result.append((char) (c + 13 - ('z' - 'a' + 1)));
            } else if ((c + 13) > 'Z' && Character.isUpperCase(c)) {
                result.append((char) (c + 13 - ('Z' - 'A' + 1)));
            } else {
                result.append((char) (c + 13));
            }
        }
        return String.valueOf(result);
    }
}
