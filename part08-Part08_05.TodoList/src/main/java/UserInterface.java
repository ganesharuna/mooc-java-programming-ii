
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ganesh
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.scanner=scanner;
        this.list=list;
    }
    
    public void start(){
        
        while (true){
            String command=scanner.nextLine();
            
            if (command.equals("stop")){
                break;        
            }
            
            if (command.equals("add")){
                String task=scanner.nextLine();
                list.add(task);
            }
            if (command.equals("list")){
                list.print();
            }
            if (command.equals("remove")){
                int task=Integer.valueOf(scanner.nextLine());
                list.remove(task);
            }
            
        }
    }
}
