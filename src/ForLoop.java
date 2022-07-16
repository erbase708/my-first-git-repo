public class ForLoop {
    public static void main(String[] args) {

        String str="ı believe ı can flay";

        for( int i=str.length()-1; i>=0 ; i--){
            System.out.print(str.substring(i,i+1));
        }

    }
}
