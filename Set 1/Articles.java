//Wap to accept a string and put "an" before every word beginning with a vowel
class Articles
 {
     boolean isVowel(char ch)
     {
         ch=Character.toLowerCase(ch);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
         return true;
         return false;
        }
     public static void main(String str)
     {
         str.trim();
         str+=" ";
         int l=str.length();
        String n="";
        String wd="";
        Articles ob=new Articles();
          for(int i=0;i<l;i++)
         {
             char ch=str.charAt(i);
             if(ch==' ')
             {
                if(ob.isVowel(wd.charAt(0)))
                 n=n+" an "+wd;
                else 
                n=n+" "+wd+" ";
                wd="";
             }
             else
              wd+=ch;
        }
         System.out.println(n);
        }
    }
  /*input: Aberdeen is an alkaline alchemist.
   *  an Aberdeen an is an an an alkaline an alchemist.

   */
