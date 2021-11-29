
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

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
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        
        String answer=scanner.nextLine();
        if(answer.equals("n")){
            double averageneg=inputs.stream()
                    .mapToInt(i->Integer.valueOf(i))
                    .filter(i ->i<0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: "+averageneg);
        }
        else if(answer.equals("p")){
            double averagepos=inputs.stream()
                    .mapToInt(i->Integer.valueOf(i))
                    .filter(i ->i>0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: "+averagepos);
        }
        
        
        
    }}

    

