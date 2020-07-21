
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input= new ArrayList<>();
        
        
        while (true){
            String read=scanner.nextLine();
            if (read.equals("end")){
                break;
            }
            
            input.add(Integer.valueOf(read));
            
                
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String sign=scanner.nextLine();
        
        if (sign.equals("n")){
            
            double average = input.stream()
                .mapToInt(s -> s)
                .filter(number ->number<0)
                .average()
                .getAsDouble();
            System.out.println("Average of the negative numbers: "+ average);
        }else if (sign.equals("p")){
                
            double average=input.stream()    
                .mapToInt(s -> s)
                .filter(number ->number>=0)
                .average()
                .getAsDouble();
            System.out.println("Average of the positive numbers :"+ average );
        }
        }

    }

