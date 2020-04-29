class D3Point extends D2Point
{
    double z;
    D3Point()
    {
        super();
        z=0;
    }

    D3Point(double nx,double ny,double nz)
    {
        super(nx,ny);
        z=nz;
    }
    
    double distance3d(D3Point b)
    {
        double p=(this.distance2d(b))*(this.distance2d(b))+(z-b.z)*(z-b.z);
        return Math.sqrt(p);
    }
}
