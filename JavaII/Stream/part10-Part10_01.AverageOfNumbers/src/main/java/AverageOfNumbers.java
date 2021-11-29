
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                inputs.add(input);
            }
           
        }
        
        double average= inputs.stream()
                .mapToInt(i->Integer.valueOf(i))
                .average()
                .getAsDouble();
        
        System.out.println("average of the numbers: "+ average);
    }}
            

        
        

  
