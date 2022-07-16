package Practice01;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Map5 {
    public static void main(String[] args) {
        String s= "Apex is easy.Type codes to learn Apex.To earn money to learn apex.";
        s=s.replaceAll("\\p{Punct}","").toLowerCase();
        Map<String,Integer>wordOccurance=new HashMap<>();
        String[]words=s.split("");
        for(String w:words){
            Integer numOfOccurance=wordOccurance.get(w);

        if(numOfOccurance==null){
            wordOccurance.put(w,1);
        }else{
            wordOccurance.put(w,numOfOccurance+1);
        }

        }
        System.out.println(wordOccurance);

    }
}      // =11, A=2, a=5, c=1, d=1, e=10, i=1, l=2, m=1, .=3, n=4, o=5, p=4, r=3, s=3, T=2, t=2, x=3, y=3}

//        =11, a=7, c=1, d=1, e=10, i=1, l=2, m=1, n=4, o=5, p=4, r=3, s=3, t=4, x=3, y=3}