class D2Point
 {
     double x,y;
     D2Point()
     {
         x=0;
         y=0;
        }
     D2Point(double nx,double ny)
     {
         x=nx;
         y=ny;
        }
     double distance2d(D2Point b)
     {
         double l=(x-b.x)*(x-b.x)+(y-b.y)*(y-b.y);
         return Math.sqrt(l);
        }
    }