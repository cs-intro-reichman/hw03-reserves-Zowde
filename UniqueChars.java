/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
       if(s=="")
       {
        return s;
       }
     String news=""+s.charAt(0);//initialize the new string
     for(int i=0;i<s.length();i++)
     {
        if(news.indexOf(s.charAt(i))==-1||s.charAt(i)==' ')
        {
            news+=s.charAt(i);
        }
       
    } 
        return news;
    
}
}
