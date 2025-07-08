package TwoPointers;

public class SortedArray
{
    public static int[] sortArray(int[] n)
    {
        int N = n.length;
        int[] result = new int[N];
        int left = 0;
        int right = N-1;

        for(int i=N-1;i>0;i--)
        {
            int square =0;
            if(Math.abs(n[left])<Math.abs(n[right]))
            {
                square = n[right];
                right--;
            }
            else
            {
                square= n[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;

    }

    public static void main(String[] args)
    {
        int[] arr = {-4,-1,0,3,10};
        int[] ans = sortArray(arr);
        for(int result : ans )
        {
            System.out.print(result+" ");
        }
    }
}
