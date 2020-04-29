import java.io.*;
class Sentence
 {
     String str, rev;
     int n;
     Sentence()
     {
         n=0;
         str="";
         rev="";
        }
     void accept() throws IOException
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter String.");
         str=br.readLine();
         System.out.println("Enter enc factor.");
         n=(Integer.parseInt(br.readLine()))%26;
        }
     void encodeString()
     {
         for(int i=0;i<str.length();i++)
         {
             char ch=str.charAt(i);
             if(ch>='A'&&ch<='Z')
             {
                 ch+=n;
                 if(ch>'Z')
                 ch-=26;
                }
             if(ch>='a'&&ch<='z')
             {
                 ch+=n;
                 if(ch>'z')
                 ch-=26;   
                }
             rev+=(char)ch;
            }
        }
     void display()
     {
         System.out.println(rev);
        }
    }
    
         