package StringManipulation;

public class Practice05 {
    public static void main(String[] args) {
         /*Type code to check if a String has an uppercase initial and dot at the end.
         Example: For ‘Ali’ your code should print false on the console
         For ‘ali.’ your code should print false on the console
         For ‘ Ali. ’ your code should print false on the console
         For ‘Ali.’ your code should print true on the console
          For ‘ALI.’ your code should print true on the console */
        
        
        
        
        String s="ahmet hüseyin";
        char firstChar =s.charAt(0);
        char lastChar =s.charAt(s.length()-1);
        char fistChar = 0;
        Boolean isTheFistCharUpper=fistChar>='A'&&lastChar<='Z';
        Boolean isTheLastCharDot= lastChar=='.';
        Boolean isFirstUpperAndLastDot=isTheFistCharUpper&&isTheLastCharDot;
        System.out.println(isFirstUpperAndLastDot);
        
        
        
    }


}


