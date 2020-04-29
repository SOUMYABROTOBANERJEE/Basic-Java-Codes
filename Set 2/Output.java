class Output
{
  int recs(int num)
  {
      if(num==0)
      return 0;
      else
      return num+recs(num-1);
    }
  void main()
  {
      int r=0;
      for(int i=10;i>=0;i--)
      {
          r=recs(i--);
          System.out.println("i="+i+"r="+r);
        }
    }
}