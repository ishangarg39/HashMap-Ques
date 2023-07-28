import java.util.HashSet;

public class SetFunctions {
    public static int union(int[] arr1, int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        for (int j : arr1) {
            set.add(j);
        }
        for (int j : arr2) {
            set.add(j);
        }
        return set.size();
    }

    public static int intersection(int[] arr1, int[] arr2)
    {
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        for(int j:arr2){

            if(set.contains(j))
            {
                count++;
                set.remove(j);
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr1 ={1,2,2,6,5,4,8};
        int[] arr2 ={7,5,2,5,3,2};
        System.out.println("Union: "+union(arr1,arr2));
        System.out.println("Intersection: "+intersection(arr1,arr2));
    }
}

