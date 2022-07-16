package StringManipulation;

public class Practice03 {
    public static void main(String[] args) {

        String s="3456thgyu8790";
        String numOfNonDigitChars=s.replaceAll("[0-9]","");
        System.out.println(numOfNonDigitChars.length());

    }
}
