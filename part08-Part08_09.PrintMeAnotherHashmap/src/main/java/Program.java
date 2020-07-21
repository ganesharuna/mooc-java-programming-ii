
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));
    }
    
    public static void printValues(HashMap<String,Book> hashmap){
        for (String key: hashmap.keySet()){
            System.out.println(hashmap.get(key));
        }
    }
    
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for (Book book: hashmap.values()){
            if (book.getName().contains(text)){
                System.out.println(book);
            }
        
    }
    }

}
