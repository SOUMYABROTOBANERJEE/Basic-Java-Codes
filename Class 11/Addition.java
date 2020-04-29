/*
 * Perform addition in base two for two operands
 */
class Addition
 {
     public static void main(String str1, String str2)
     {
         String res="";
         int sum=0;
         int carry=0;
         int dig1=0,dig2=0;
         int l;
         int l1=str1.length();
         int l2=str2.length();
         for(int j=0;j<(l1>l2?l1-l2:l2-l1);j++)
         {
             if(l2>l1)
             str1="0"+str1;
             else if(l1>l2)
             str2="0"+str2;
            }
         l=str1.length();    
         for(int i=l-1;i>=0;i--)
         {
           dig1=str1.charAt(i)-48;
           dig2=str2.charAt(i)-48;
           sum=(dig1+dig2+carry)%2;
           carry=(dig1+dig2+carry)>1?1:0;
           res+=sum;
           if(i==0 && carry==1)
           res="1"+res;
        }
        System.out.println(res);
    }
}
/*
 * 1001
 * 111
 * 10000
 */
             