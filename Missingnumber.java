import java.util.*;
class Solution {
    public int missingNumber(int[] nums)
    {
        int n=nums.length;
        ArrayList<Integer>al=new ArrayList<>();
        for(int x:nums)
        {
            al.add(x);
        }
        int res=0;
        for(int i=0;i<=n;i++)
        {
            if(!(al.contains(i)))
                res=i;
        }
        return res;
    }
}
class Missingnumber
{
    public static void main(String[] args) 
    {
        int nums[]={0,1,2};
        Solution s=new Solution();
        int found=s.missingNumber(nums);
        System.out.println("ans is "+found);
        
    }
}