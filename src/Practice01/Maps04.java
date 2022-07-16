package Practice01;

import java.util.*;

public class Maps04 {
    public static void main(String[] args) {
        Map<String,Integer>product=new HashMap<>();

        product.put("Laptop",82);
        product.put("TV",53);
        product.put("Refrigator",12);
        product.put("music System",87);
        product.put("mobile phone",53);

        Set<String> productNameAsSet=product.keySet();
        List<String>productNameAsList=new ArrayList<>(productNameAsSet);
        Collections.sort( productNameAsList);

        System.out.println(productNameAsList);
    }


}
