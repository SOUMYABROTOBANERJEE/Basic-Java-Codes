class Frequency
 {
     public static void main(String str)
     {
         str=str.toUpperCase().trim();
         int[] arr=new int[5];
         for(int i=0;i<str.length();i++)
         {
             switch(str.charAt(i))
             {
                 case 'A':arr[0]++;
                 break;
                 case 'E':arr[1]++;
                 break;
                 case 'I':arr[2]++;
                 break;
                 case 'O':arr[3]++;
                 break;
                 case 'U':arr[4]++;
                 break;
            }
        }
        System.out.println("A"+arr[0]);
        System.out.println("E"+arr[1]);
        System.out.println("I"+arr[2]);
        System.out.println("O"+arr[3]);
        System.out.println("U"+arr[4]);
    }
}

        
        