import java.io.*;
class MatrixRearrange
{
    int m,n;
    int[][]mat;
    int[] arr,max,min;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    MatrixRearrange(int p,int q)
    {
        m=p;
        n=q;
        mat = new int[m][n];
        arr=new int[m*n];
        max=new int[3];
        min=new int[3];
    }

    void accept()throws IOException
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter element:"+(i+1)+","+(j+1));
                mat[i][j]=Integer.parseInt(br.readLine());
            }
        }
    }

    void convert()
    {
        int k=0;
        max[0]=mat[0][0];
        min[0]=max[0];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[k++]=mat[i][j];
                if(max[0]<mat[i][j])
                {
                    max[0]=mat[i][j];
                    max[1]=i;
                    max[2]=j;
                }
                if(min[0]>mat[i][j])
                {
                    min[0]=mat[i][j];
                    min[1]=i;
                    min[2]=j;
                }
            }
        }
    }


    void withoutOneD()
    {
        System.out.println("MODIFIED BUBBLE SORT.");
        for(int i=0;i<m*n-1;i++)
        {   int row=0,col=0;
            for(int j=0;j<m*n-1-i-1;j++)
            {
                if(col==n-1)
                {
                    if(mat[row][col]>mat[row+1][0])
                    {
                        int temp=mat[row][col];
                        mat[row][col]=mat[row+1][0];
                        mat[row+1][0]=temp;
                    }
                    row++;
                    col=0;
                }
                else
                {
                    if(mat[row][col]>mat[row][col+1])
                    {
                        int temp=mat[row][col];
                        mat[row][col]=mat[row][col+1];
                        mat[row][col+1]=temp;
                    }
                    col++;
                }
            }
        }
    }


    void searchSort()
    {
        System.out.println("MAX MIN SORT.");
        int high=max[0],low=min[0];
        int[][] vect=new int[m][n];
        int row=0,col=0;
        for(int i=low;i<=high;i++)
        {
            for(int j=0;j<m;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(mat[j][k]==i)
                    {
                        vect[row][col++]=i;
                        if(col==n)
                        {
                            col=0;
                            row++;
                        }
                    }
                }
            }
        }
        mat=vect;
    }

    void bubbleSort()
    {
        System.out.println("1D SORT TECHNIQUE");
        int l=arr.length;
        for(int i=0;i<l-1;i++)
        {
            for(int j=0;j<l-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }   
    }

    void arrange()
    {
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=arr[k++];  
            }
        }
    }

    void printMaxMin()
    {
        System.out.println("LARGEST NO.="+max[0]+" ROW="+(max[1]+1)+" COLUMN="+(max[2]+1));
        System.out.println("SMALLEST NO.="+min[0]+" ROW="+(min[1]+1)+" COLUMN="+(min[2]+1));
    }

    void display()
    {
        System.out.println("REARRANGED MATRIX:");  
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();   
        }
    }

    public static void main()throws IOException

    {
        int r=0,c=0,choice;
        try{
            do
            {
                System.out.println("Enter no. of rows, then columns.");
                r=Integer.parseInt(br.readLine());
                c=Integer.parseInt(br.readLine());
            }while(c>22||r>22||r<2||c<2);
            MatrixRearrange obj=new MatrixRearrange(r,c); 
            obj.accept();
            obj.convert();
            do{
                System.out.println("Enter choice:");
                System.out.println("1 for sort using 1D.");
                System.out.println("2 for modified bubble sort, without 1D");
                System.out.println("3 for max min sort, without 1D.");
                choice=Integer.parseInt(br.readLine());
            }while(choice<1||choice>3);
            if(choice==1)
            {
                obj.bubbleSort();
                obj.arrange();
            }
            else if(choice==2)
            obj.searchSort();
            else
            obj.withoutOneD();//impossible is nothing
            obj.printMaxMin();
            obj.display();
        }
        catch(NumberFormatException e)
        {
            System.out.println("Wrong input.");
        }
    }
}