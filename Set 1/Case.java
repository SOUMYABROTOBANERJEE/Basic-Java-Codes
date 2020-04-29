class Case
 {
     void main(String str)
     {
         str.trim();
         str+=" ";
         String word="";
         int l=str.length();
         for(int i=0;i<l;i++)
         {
             if(str.charAt(i)!=' '&&str.charAt(i)!='.')
             word+=str.charAt(i);
             else
             {
                 if(Character.isUpperCase(word.charAt(0))&&Character.isLowerCase(word.charAt(word.length()-1)))
                 System.out.print(word+" ");
                 word="";
                }
            }
        }
    }
    