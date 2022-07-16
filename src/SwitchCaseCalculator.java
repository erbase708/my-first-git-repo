import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        double x=input.nextDouble();
        System.out.println("2.sayıyı giriniz");
        double y= input.nextDouble();

        System.out.println("yapmak istediğiniz işlemi giriniz; +,-,*,%");

        char opr= input.next().charAt(0);
         switch(opr){
             case'+':
                 System.out.println(x+"+"+y+"="+(x+y));
                 break;
             case'-':
                 System.out.println(x+"-"+y+"="+(x-y));
                 break;
             case'*':
                 System.out.println(x+"*"+y+"="+(x*y));
                 break;
             case'/':
                 System.out.println(x+"%"+y+"="+(x/y));
                 break;
             default:
                     System.out.println("lütfen geçerli bir sayı giriniz");



        }
    }
}
