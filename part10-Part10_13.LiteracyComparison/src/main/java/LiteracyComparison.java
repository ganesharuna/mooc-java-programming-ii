import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class LiteracyComparison {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
       
        ArrayList<Literacy> lit = new ArrayList<>();
       
        try (Scanner fileReader = new Scanner(Paths.get("literacy.csv"))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
               
                parts[2]=parts[2].trim();
                String gender=parts[2];
                if (gender.contains("female")){
                    gender="female";
                }else{
                    gender="male";
                }
               
                parts[3]=parts[3].trim();
                String country=parts[3];
                parts[4]=parts[4].trim();
                int year=Integer.valueOf(parts[4]);
                parts[5]=parts[5].trim();
                double liter=Double.valueOf(parts[5]);
                lit.add(new Literacy(country,year,gender,liter));
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        lit.stream().sorted((p1,p2)->{
            return Double.compare(p1.getRate(),p2.getRate());
        }).forEach(p->System.out.println(p));
    }
}