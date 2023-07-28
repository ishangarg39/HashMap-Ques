import java.util.HashMap;
public class ItineraryTickets {

    public static String findStart(HashMap<String,String> path){
        String start=null;
        for(String key: path.keySet()){
            if(!path.containsValue(key)){
                start= key;
            }
        }
        return start;
    }

    public static void printPath(String key,HashMap<String ,String> path){
        while(path.containsKey(key)){
            System.out.print(key+"->");
            key=path.get(key);

        }
        System.out.print(key);
    }
    public static void main(String[] args){
        HashMap<String,String> path=new HashMap<>();
        path.put("Chennai","Bengaluru");
        path.put("Mumbai","Delhi");
        path.put("Goa","Chennai");
        path.put("Delhi","Goa");
        String start=findStart(path);
        printPath(start,path);
    }
}
