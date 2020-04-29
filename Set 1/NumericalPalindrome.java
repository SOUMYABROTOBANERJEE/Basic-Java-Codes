/*
 * WAP to accept a string and display the number of numerical palindromes in the string
 */
class NumericalPalindrome
 {
     boolean isNumericalPalindrome(String str)
     {
         int l=str.length();
         String n="";
         for(int i=0;i<l;i++)
         {
             char ch=str.charAt(l-i-1);
             if(!Character.isDigit(ch))
             return false;
             n+=ch;
            }
          if(str.equals(n))
          return true;
          return false;
        }
     void main(String str)
     {
         str.trim();
         str=str+" ";
         int l=str.length();
         String word="";
         int n=0;
         for(int i=0;i<l;i++)
         {
             char ch=str.charAt(i);
             if(ch!=' '&&ch!='.')
             word+=ch;
             else
             {
                 if(isNumericalPalindrome(word))
                 n++;
                 word="";
                }
            }
         System.out.println(str+" has this many numerical palindromes:");
         System.out.println(n);
        }
    }
    /*
     * madam arora 12321 malayalam 123m321  has this many numerical palindromes:
1

     */
             
