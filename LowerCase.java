/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str=args[0];
        System.out.print(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String news="";
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
        {
          news+=(char)(s.charAt(i)+32);
        }
        else
        {
        news+=s.charAt(i);
        }
       }
        return news;
    }
}
