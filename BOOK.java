import java.util.Scanner;
public class BOOK {
    int book_no,price,total_cost;
    String  book_title;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book no:");
        book_no=sc.nextInt();
        System.out.println("Enter the price:");
        price=sc.nextInt();
        System.out.println("Enter the book title:");
        book_title=sc.next();
        System.out.println("Enter the number of book:");
        total_cost=sc.nextInt();

    }
    void show()
       {
        System.out.println("Enter the total coast :"+(num*price));
       }      
    }

    public static void main(String args[])
       {
          BOOK ob= new BOOK();
          ob.input();
          ob.show();
       }

