import java.util.*;

public class List {
    public static void main(String[] args) {

        Map map= new HashMap();
        map.put(1,"Ziya");
        map.put(2,"eli");
        map.put(3,"qulu");
        Set set=map.entrySet();
        Set it=map.keySet();



        Iterator map1=set.iterator();
        while(map1.hasNext()){
            System.out.println(map1.next());
        }
        Iterator map2=it.iterator();
        while(map2.hasNext()){
            System.out.println(map2.next());
        }



        }






    }



