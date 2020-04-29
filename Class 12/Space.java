class Space
 {
     public static void main()
     {
         D3Point a=new D3Point(0,0,0);
         D3Point b=new D3Point(4,4,7);
         System.out.println(a.distance2d(b));
         System.out.println(a.distance3d(b));
        }
}