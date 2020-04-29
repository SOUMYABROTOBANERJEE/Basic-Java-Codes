/*
 * WAP to arrange the elements of an array according to the following rule:
 * The average element is the sum of the largest and the smallest element.
 * All elements greater than the average are arranged in descending order in the former part of the array.
 * All elements smaller than the average are arranged in ascending order in the latter part of the array.
 */
class AverageArray
 {
     void main(int[] arr)
     {
         int l=arr.length;
         int max=arr[1],min=arr[1];
         for(int i=0;i<l;i++)
         {
             if(max<arr[i])
             max=arr[i];
             if(min>arr[i])
             min=arr[i];
            }
         double avg=(max+min)/2;
         for(int i=0;i<l;i++)
         {
             for(int j=0;j<l-i-1;j++)
             {
                 if(arr[j]>avg && arr[j+1]>avg && arr[j+1]>arr[j])
                 {
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                    }
                 else if(arr[j]<=avg && arr[j+1]<=avg && arr[j+1]<arr[j])   
                 {
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                    }
                 else if(arr[j]<=avg && arr[j+1]>avg)
                 {
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                    }
                }
            }
          for(int i=0;i<l;i++)
          System.out.print(arr[i]+" ");
        }
    }
    /*
     * {1,7,3,2,5,9}
     * 9 7 1 2 3 5 
     */
                 
