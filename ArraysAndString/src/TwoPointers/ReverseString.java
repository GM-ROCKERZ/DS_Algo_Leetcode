package TwoPointers;

public class ReverseString
{
  public static String  revString(String s)
  {
    char[] word = s.toCharArray();
    int i = 0;
    int j = s.length()-1;

    while(i<j)
    {
      char temp = word[i];
      word[i] = word[j];
      word[j] = temp;
      i++;
      j--;
    }
    return new String(word);
  }

  public static void main(String[] args)
  {
    String s = "Datastructure";

    String result = revString(s);
    System.out.println(result);
  }
}
