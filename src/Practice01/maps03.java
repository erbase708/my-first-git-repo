package Practice01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class maps03 {
    public static void main(String[] args) {
        Map<String,Integer>product=new HashMap<>();

        product.put("Laptop",82);
        product.put("TV",53);
        product.put("Refrigator",12);
        product.put("music System",87);
        product.put("mobile phone",53);

        Object[]productPrice=product.values().toArray();
        Arrays.sort(productPrice);

        System.out.println(Arrays.toString(productPrice));
    }
}
