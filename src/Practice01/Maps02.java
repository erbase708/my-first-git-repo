package Practice01;

import java.util.HashMap;
import java.util.Map;

public class Maps02 {
    public static void main(String[] args) {

        Map<String,Integer>product=new HashMap<>();
        product.put("Laptop",12);
        product.put("TV",53);
        product.put("Refrigator",12);
        product.put("music System",87);

        String expectedProduct ="table";
        if(product.containsKey(expectedProduct)){
            System.out.println(expectedProduct +" exists");
        }else{
            System.out.println(expectedProduct +" does not exist");
        }
    }
}
