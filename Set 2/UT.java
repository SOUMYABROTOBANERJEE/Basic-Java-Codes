class UT
{
  int n,oct;
  UT(int a)
  {
      n=a;
      oct=0;
    }
  void deci_Oct()
  {
      if(n==0)
      return;
      else
      {
          int k=n%8;
          n/=8;
          deci_Oct();
          oct*=10;
          oct+=k;
        }
    }
}