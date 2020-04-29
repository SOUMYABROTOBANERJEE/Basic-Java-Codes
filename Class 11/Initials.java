class Initials
 {
     void main(String str)
     {
         str.trim();
         str=" "+str;
         String init="";
         for(int i=0;i<str.lastIndexOf(' ');i++)
         {
             if(str.charAt(i)==' ')
             init+=(str.charAt(i+1)+".");
            }
         init+=str.substring(str.lastIndexOf(' '));
         System.out.println(init);
        }
    }
    
        

