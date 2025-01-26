

import java.util.HashMap;


public class HashMapExample {

    
    public static void main(String[] args) {
        
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        System.out.println("HashMap "+map);

        
       System.out.println("value for key 2 "+ map.get(2));

       System.out.println("Iterating through the map");

       for(Integer key:map.keySet()){
        System.out.println("Key"+key+"Value "+map.get(key));
       }
    }
    
}
