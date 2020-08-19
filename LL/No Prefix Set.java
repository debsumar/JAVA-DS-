public class Solution {

   public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    HashMap<String,Integer> h=new HashMap<String,Integer>();
    HashMap<String,Integer> hm=new HashMap<String,Integer>();
    int count=0;
    for(int i=0;i<n;i++)
    {
       String str=scan.next();
       for(int j=0;j<str.length();j++)
       {
           String p=str.substring(0,j+1);
           if(j<str.length()-1)
           {
           hm.put(p,1);
           }
           if((h.containsKey(p)) ||(hm.containsKey(str)))
           {
               count++;
               System.out.println("BAD SET");
               System.out.println(str);
               break;
           }

       }
       if(count==1)
       {
           break;
       }
       else
      {
          h.put(str,1);
      }
    }
    if(count==0)
    {
        System.out.println("GOOD SET");
    }
}
}