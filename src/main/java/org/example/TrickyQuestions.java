package org.example;

public class TrickyQuestions {

        /*
     `Look into examples below,see if you can predict what the result of the calculation will be, write a test to see if you are right. Write wrong assumtptions.Make your own  examples for the ones you got wrong.`

    `1. int x = 5;int y = 2;int result = x++ * ++y;` <- My assumption: 5 * 3 = 15

    `2. int a = 3;int b = 4;int c = a + b * (a = 5);String result = (c + " " + a);` <- My assumption: 3 + 4 * 5 = 23

    `3.int x = 1;int y = x++ + ++x + xresult = y` <- My assumption: 1 + 3 = 4

    `4.boolean flag = false;if (flag = true) { result = "YES";} else {result = "NO";}` <- My assumption: "YES"

    `5.int x = 10;result = ( x + x++ + --x + x--)` <- My assumption: 10 + 10 + 10 + 10 = 40

    `6. boolean A = true;boolean B = false;boolean C = true;boolean result = A || B && !C;` <- My assumption: result = true

    `7. boolean A = true;boolean B = false;boolean C = true;boolean result = (A || B) && !C;` <- My assumption: result = false

    `8.int a = 5;        int b = 3;        int result = a & b;` <- My assumption: 101 & 011 -> 001?? result = 1

    `9.byte b = 10;b = b + 5;b = ?` <- My assumption: error: cannot downcast int to byte (const 5 is by default an int)

    `10.byte b = 10;b += 5;b = ?` <- My assumption: b = 15

    `11. Autoboxing1. Difference between type promotion and autoboxing - make method for each2.` <- My answer: Type promotion: widening of a type in order to fit a bigger number without overflow,
     a seatbelt feature in java. Autoboxing: changing a type into its wrapper class (each type has its own) in order to have access to certain overloaded methods and other features.
         */
Integer autoboxing(int victimOfAutoboxing){
return new Integer(victimOfAutoboxing);
}

int typePromotion(byte candidateForPromotion, int raise){
    return raise + candidateForPromotion;
}
}