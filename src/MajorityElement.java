import java.util.HashMap;

public class MajorityElement
{
    public static void main(String args[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int nums[]={1,3,2,5,1,3,1,5,1};
        for(int i=0;i< nums.length;i++){
            if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }
            else {
                map.put(nums[i],1);
            }
        }
        int el=0;
        int n=nums.length;
        for(int key: map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key);
            }
        }
    }
}
