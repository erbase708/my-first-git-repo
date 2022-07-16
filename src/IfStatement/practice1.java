package IfStatement;

public class practice1 {
    public static void main(String[] args) {
        /* a) "Isosceles Triangle" if two sides of a triangle are equal in length.
 b) "Equilateral Triangle" if all sides of a triangle are equal in length.
 c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied */


        int a = 5;
        int b = 5;
        int c = 5;

        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b && b != c || a == c && b != c || b == c && a != c) {
            System.out.println("ısosceles Triangle");
        } else {
            System.out.println("Neither isosceles,nor equilateral");
        }
    }
}
