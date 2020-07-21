
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String command=scanner.nextLine();
            
            if(command.equals("end")){
                break;
            }
            
            int cube=Integer.valueOf(command);
            System.out.println(cube*cube*cube);
        }
        
    }
}
