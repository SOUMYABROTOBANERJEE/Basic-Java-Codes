//WAP that accepts a sentence and prints the qwords in the reverse order, but without the punctuation.
import java.io.*;
class RevMinusPunct
 {
     String snt,rev;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     RevMinusPunct()
     {
         snt=rev="";
        }
     void input() throws IOException
     {
         System.out.println("Enter sentence.");
         snt=br.readLine();
        }    
     void rearrange()
     {
         int l=snt.length();
         String wd="";
         for(int i=0;i<l;i++)
         {
             char ch=snt.charAt(i);
             if(Character.isLetterOrDigit(ch)||Character.isWhitespace(ch)||ch=='.')
             {
                 if(ch==' '||ch=='.')
                 {
                     rev=wd+" "+rev;
                     wd="";
                }
                else
                wd+=ch;
            }
        }
        System.out.println(rev);
    }
    public static void main() throws IOException
    {
       RevMinusPunct obj=new RevMinusPunct();
       obj.input();
       obj.rearrange();
    }
}
/*
 * Enter sentence.
Hello, my lord, provider, benefactor, and philosopher.
philosopher and benefactor provider lord my Hello 

 */
                
     