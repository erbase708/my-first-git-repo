package StringManipulation;

public class practice02 {
    public static void main(String[] args) {

        String s="   illogical5677  .0** ";
        String numOfChar    ;
        numOfChar = s.replaceAll("\\s","").replaceAll("[A-Za-z0-9]!","");
        System.out.println(numOfChar.length());



    }
}
