class ReplaceVowels
 {
     void main(String str)
     {
         char arr[]={'a','e','i','o','u','A','E','I','O','U'};
         str.trim();
         int l=str.length();
         String n="";
         for(int i=0;i<l;i++)
         {
             boolean flag=false;
             char ch=str.charAt(i);
             for(int j=0;j<10;j++)
             {
                 if(ch==arr[j])
                 {
                  flag=true;
                  break;
                }
            }
            if(flag)
            n+='*';
            else
            n+=ch;
        }
        System.out.println(n);
    }
}
