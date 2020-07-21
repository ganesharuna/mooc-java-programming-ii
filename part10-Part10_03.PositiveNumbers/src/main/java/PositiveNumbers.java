
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {
    
    public static List<Integer> positive (List<Integer> numbers){
        List<Integer> plus=new ArrayList<>();
        for (int number: numbers){
            if (number>0){
                plus.add(number);
            }
        }
        return plus;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
            list.add(3);
            list.add(7);
            list.add(4);
            list.add(2);
            list.add(6);
            
         List<Integer> positive = list.stream()
                 .filter(number -> number > 0)
                 .collect(Collectors.toList());
    }
    
    

}
