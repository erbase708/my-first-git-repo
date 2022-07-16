package Practice01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        Map<String,Integer>product=new HashMap<>();
        product.put("Laptop",12);
        product.put("TV",53);
        product.put("Refrigator",12);
        product.put("music System",87);

        Collection<Integer>numOfProducts= product.values();

        Integer sum=0;
        for(Integer w:numOfProducts){
            sum=sum+w;
        }
        System.out.println(sum);


    }





}
