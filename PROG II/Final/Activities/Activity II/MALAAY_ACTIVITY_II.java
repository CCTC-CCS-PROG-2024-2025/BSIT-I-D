import java.util.Scanner;

public class MALAAY_JUSTINE_ACTIVITY_II {  

   
    public static void convertToInches(int feet) {
        int inches = feet * 12; 
        System.out.println("Inches: " + inches); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter feet: ");
        int feet = scanner.nextInt();

    
        convertToInches(feet);


    }
}
         }