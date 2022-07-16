package StringManipulation;

public class Practice1 {
    public static void main(String[] args) {
        String s="tom hanks.";
        char firstChar=s.charAt(0);

        char lastChar=s.charAt(s.length()-1);
        Boolean isTheFirstCharUpper= firstChar>='A'&&lastChar<='Z';
        Boolean isTheLastCharDot=lastChar=='.';
        Boolean isFirstUpperAndLastDot=isTheFirstCharUpper&&isTheLastCharDot;
        System.out.println("is the fist char upper and the last char dot?"+isFirstUpperAndLastDot);





    }
}
