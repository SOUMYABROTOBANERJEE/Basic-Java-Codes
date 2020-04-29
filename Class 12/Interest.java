class Interest
 {
     public static void main()
     {
         Simple s=new Simple(1,1000,10,5);
         Compound c=new Compound(2,1000,9,5);
         c.display();
         s.display();
        }
    }