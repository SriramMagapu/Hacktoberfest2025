class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i] <=1 )
                  continue;
            boolean prime  = true;
            for(int j=2;j * j<=nums[i];j++){
               if(nums[i] % j == 0){
                prime = false;
                break;
               } 
            }
            if(prime){
                li.add(i);
            }
        }
        if(li.size() <= 1){
            return 0; 
        }

        
        return li.get(li.size() -1) - li.get(0);
    }
}
