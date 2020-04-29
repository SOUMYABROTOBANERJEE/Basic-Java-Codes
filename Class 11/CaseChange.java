class CaseChange
 {
     void main(String str)
     {
         str.trim();
         int l=str.length();
         String s="";
         for(int i=0;i<l;i++)
         {
             char ch=str.charAt(i);
             if(ch>64&&ch<91)
             ch+=32;
             else if(ch>96&&ch<123)
             ch-=32;
             s=s+(char)ch;
            }
         System.out.println(s);
        }
    }
    
             