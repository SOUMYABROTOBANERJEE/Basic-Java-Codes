class PalindromeCount
 {
     boolean isPal(String str)
     {
         String rev="";
         for(int i=str.length()-1;i>=0;i--)
          rev+=str.charAt(i);
         if(rev.equalsIgnoreCase(str))
          return true;
         return false;
        }
     void main(String str)
     {
         str.trim();
         str=str+" ";
         int l=str.length(),f=0;
         String word="";
         for(int i=0;i<l;i++)
         {
             if(str.charAt(i)!=' ')
             word+=str.charAt(i);
             else
             {
                 if(isPal(word))
                 f++;
                 word="";
                }
            }
         System.out.println(str);
         System.out.println(f);
        }
    }
    
         
             
 