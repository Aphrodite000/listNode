import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static List<Integer> ArrayMax(int[] array){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            int c=map.getOrDefault(array[i],0);
            map.put(array[i],c+1);
        }
        List<Integer> list=new ArrayList<>();
        int max=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(max==0){
                max=e.getValue();
            }else{
                if(max<e.getValue()){
                    max=e.getValue();
                }
            }
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==max){
                list.add(e.getKey());
            }
        }
        return list;
    }
}
