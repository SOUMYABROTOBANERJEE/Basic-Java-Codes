class SpcDel
{ 
  void main(String str)
  {
      str.trim();
      int l=str.length();
      String n="";
      n+=str.charAt(0);
      for(int i=1;i<l;i++)
      {
          char ch=str.charAt(i);
          if(ch!=' ')
          n+=ch;
          else if(str.charAt(i-1)!=' ')
          n+=ch;
        }
      System.out.println(n);
    }
}

          
