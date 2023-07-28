import java.util.HashMap;

public class SubarraySum {

    public static int arraysum(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            sum=arr[i]+sum;
            if(map.containsKey(sum-k)) {
                int fre = map.get((sum - k));
                ans = ans + fre;
                System.out.println(fre);
            }

                if(map.containsKey(sum))
                {
                    int fre=map.get((sum));
                    map.put(sum,fre+1);
                }
                else{
                map.put(sum,1);
                }
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[]={10,2,-2,-20,10};
        int k=-10;
        System.out.println(arraysum(arr,k));
    }
}
