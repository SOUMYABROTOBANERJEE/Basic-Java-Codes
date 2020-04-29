/**
 * Take String as input and generate following output.
 */
class EncDec
 {
     char convert(String str)
     {
         int a=Integer.parseInt(str);
         return (char)a;
        }
     void main(String str)
     {
         str.trim();
         int l=str.length();
         for(int i=0;i<l;)
         {
             if(str.charAt(i)!='1')
             {
                 System.out.print(convert(str.substring(i,i+2)));
                 i+=2;
                }
             else
             {
             System.out.print(convert(str.substring(i,i+3)));
             i+=3;
            }
        }
    }
}
/*
 * "67686932102104118"
 * CDE fhv
 */

        
