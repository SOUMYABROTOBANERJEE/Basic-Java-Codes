class RandomPass
{
    public static void main()
    {
        generateRandom();
    }
    static void generateRandom()
    {
        double a=Math.random()*5;
        for(int i=0;i<8+a;i++)
        {
            int key=(int)(Math.random()*62);
            if(0<=key&&key<10)
                System.out.print((char)(48+key));
            else if(10<=key&&key<36)
                System.out.print((char)(55+key));
            else
                System.out.print((char)(key+61));
        }
    }
}