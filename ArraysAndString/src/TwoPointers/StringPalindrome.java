package TwoPointers;

public class StringPalindrome
{
    public static boolean checkIfPalindrome(String s)
    {
        int left = 0;
        int right = s.length()-1;

        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String s = "racecar";
        if(checkIfPalindrome(s))
        {
            System.out.println("given string is palindrome");
        }
        else
        {
            System.out.println("given string is not palindrome");
        }
    }
}
