package StringManipulation;

public class practis01{
    public static void main(String[] args) {
           /* create a String veriable for city names which have just a single word.Print the city name with
     the initial is in uppercase and all the other characters are in lower console

      */

        String cityName = "ısParta";
        String UpdatedCityName= cityName.trim().toLowerCase();

        String UpdateCityName=UpdatedCityName.substring(0,1).toUpperCase()+UpdatedCityName.substring(1);

        System.out.println(UpdateCityName);




    }






    }

