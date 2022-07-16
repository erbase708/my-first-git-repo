import java.util.Locale;

public class Day09StringManipulation02 {
    public static void main(String[] args) {
         String str = "Blue";

                 String tersStr = str.substring(3).toLowerCase()+
                                  str.substring(2,3).toLowerCase()+
                                  str.substring(1,2)+
                                  str.substring(0,1).toUpperCase();
        System.out.println(tersStr);

    }
}
