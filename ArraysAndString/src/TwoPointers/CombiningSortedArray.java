package TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class CombiningSortedArray
{
    public static List<Integer>  combine(int[] arr1,int[] arr2){
        List<Integer> ans = new ArrayList<Integer>();
        int i =0;
        int j=0;

        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i] < arr2[j]) {
                ans.add(arr1[i]);
                i++;
            }
            else
            {
                ans.add(arr2[j]);
                j++;

            }
        }
        while(i<arr1.length)
        {
            ans.add(arr1[i]);
            i++;
        }
        while(j<arr2.length)
        {
            ans.add(arr2[j]);
            j++;
        }
        return ans;
    }

    public static void main(String[] args)
    {
        int[] arr1 = {1,4,7,20};
        int[] arr2 = {3,5,6};
        List<Integer> result = combine(arr1,arr2);
        System.out.println(result);
    }
}
