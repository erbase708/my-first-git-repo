package IfStatement;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {

        double BMI=5;


        Scanner input =new Scanner(System.in);
        System.out.println("please enter your weight");

        double weight= input.nextDouble();
        System.out.println("Please enter your height");
        double height= input.nextDouble();
        if(BMI<18.5){
            System.out.println("your BMI is : "+BMI+"you are weak");
        }else if(18.5<BMI&&BMI<25){
            System.out.println("your BMI is : "+BMI+"your weight is ideal");
        }else if(25<BMI&&BMI<30){
            System.out.println("your BMI is : "+BMI+"you are fat");
        }else if(BMI>30){
            System.out.println("your BMI is : "+BMI+"obesse");
        }


    }
}
