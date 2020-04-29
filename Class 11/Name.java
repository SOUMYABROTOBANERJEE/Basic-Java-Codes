/*
 * 
 */
class Name
 {
     void main(String str)
     {
         str.trim();
         String n=str.substring(str.lastIndexOf(' '));
         n+=",";
         n+=str.substring(0,str.lastIndexOf(' '));
         System.out.println(n);
        }
    }
    
