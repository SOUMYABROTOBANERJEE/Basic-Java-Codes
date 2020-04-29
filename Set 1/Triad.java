/*
 * WAP to generate all sets of Triads
 */
class Triad
 {
     void main()
     {
         for(int i=100;i<334;i++)
         {
             int n=(int)(i*Math.pow(10,6)+2*i*Math.pow(10,3)+3*i);
             if(UniqueNum.isUnique(n))
             System.out.println(i+" "+2*i+ " "+3*i);
            }
        }
    }
    /*
     * 192 384 576
     * 219 438 657
     * 267 534 801
       273 546 819
       327 654 981

     */
        