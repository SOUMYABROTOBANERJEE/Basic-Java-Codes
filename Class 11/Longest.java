import java.util.*;
class Longest
 {
     static String[] arr=new String[10];
     static void accept()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter 10 words.");
         for(int i=0;i<10;i++)
         {
             arr[i]=sc.nextLine();
            }
        }
     static void check()
     {
        int l=0,ind=0;
        for(int i=0;i<10;i++)
          if(arr[i].length()>l)
             ind=i;
         if(l>0)
         {
         System.out.println("The longest word:"+arr[ind]);
         System.out.println("The length:"+l);
        } 
    }
    public static void main()
    {
        accept();
        check();
    }
}

 