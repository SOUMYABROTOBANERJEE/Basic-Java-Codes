class ReverseWords
 {
     void main(String str)
     {
         String wd="";
         String rev="";
         str=" "+str;
         int l=str.length();
         for(int i=l-1;i>=0;i--)
         {
             char ch=str.charAt(i);
             if(ch==' '||ch=='.')
             {
                rev=wd+" "+rev;
                wd="";
             }
             else
              wd+=ch;
        }
        System.out.println(rev);
    }
}

