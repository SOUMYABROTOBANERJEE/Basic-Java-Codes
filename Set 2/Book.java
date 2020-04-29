import java.io.*;
class Book extends Publications
{
    int pg,edition;
    Book()
    {
        super();
        edition=pg=0;
    }

    void accept()throws IOException
    {
        super.accept();
        System.out.println("Enter edition no.:");
        edition=Integer.parseInt(br.readLine());
        System.out.println("No. of pages");
        pg=Integer.parseInt(br.readLine());
    }

    void display()
    {
        super.display();
        System.out.println("Edition:"+edition);
        System.out.println("No.of pages:"+pg);
    }

    private void printPrice()
    {
        int price=0;
        if(pg<200)
            price=500;
        else if(pg<600)
            price=800;
        else if(pg<2000)
            price=1500;
        cost=price;
    }

    public static void main()throws IOException
    {
        Book book=new Book();
        book.accept();
        book.printPrice();
        book.display();
        }
     }