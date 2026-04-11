package org.example.fiveKyu;

public class OperationPrecedence {
    /*
byte b = 10;
b += 5;

byte b = 10;
b = b + 5;
b = ?

     */
    public static byte kolejnosci(){
        byte b = 10;
        b = (byte) (b + 5);
        return b;
    }
}
