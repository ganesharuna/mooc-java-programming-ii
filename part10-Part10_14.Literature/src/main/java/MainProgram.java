
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Book> books=new ArrayList<>();
        int count=0;
        while (true){
            System.out.println("Input name of book, empty stops");
            String input=scanner.nextLine();
            
            if (input.equals("")){
                break;
            }
            System.out.println("Age recommendation: ");
            int age=Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(input,age));
            count++;
        }
        
        System.out.println(count+" books in total.");
        
        
        Comparator<Book> comparator=Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        
        for (Book book: books){
            System.out.println(book);
        }
        
    }

}
