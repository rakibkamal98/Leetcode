import java.util.HashMap;

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> valueCheck = new HashMap<Integer, Integer>();
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0 && valueCheck.containsKey(0) && valueCheck.get(arr[i])==1){return true;} else {
                valueCheck.put(arr[i], 1);
            }
            if(arr[i]!=0){
                if(valueCheck.containsKey(2*arr[i]) || (arr[i]%2==0 && valueCheck.containsKey(arr[i]/2))){
                    return true;
                }
            }
            
            
        }
        return false;
    }
}
