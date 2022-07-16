package StringManipulation;

public class Practice04 {
    public static void main(String[] args) {
        String s= "alall   ellii   ** ";
        int i=s.trim().length()-1;
        String r =s.substring(i,i+1);
        System.out.println(r);

    }
}
