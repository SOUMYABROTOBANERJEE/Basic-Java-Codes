class WordSort
 {
     void main(String str)
     {
         str.trim();
         int l=str.length();
         int n=0;
         for(int i=0;i<l;i++)
         {
             char ch= str.charAt(i);
             if(ch==' '||ch=='.')
             n++;
            }
         String arr[]=new String[n];
         String wd="";
         int k=0;
         for(int i=0;i<l;i++)
         {
             char ch=str.charAt(i);
             if(ch==' '||ch=='.')
             {
                 arr[k++]=wd;
                 wd="";
                }
             else
             wd+=ch;
            }
          for(int i=0;i<n-1;i++)
         {
             for(int j=1;j<n;j++)
             
                  if(arr[j-1].length()>arr[j].length())
                 {
                     String temp=arr[j];
                     arr[j]=arr[j-1];
                     arr[j-1]=temp;
                    }
                }
         for(int i=0;i<n;i++)
         System.out.print(arr[i]+" ");
            }   
        }
                
