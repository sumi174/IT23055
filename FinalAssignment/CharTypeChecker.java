import java.util.Scanner;
public class CharTypeChecker {
   public static void main(String []args) {
 Scanner sc = new Scanner(System.in);
         System.out.print("Enter Val: ");
        int val = sc.nextInt();

           System.out.println("Given Value: "+val);
      if(val >= 97 && val <= 123) {
         System.out.println("Lower Case");
      } else if(val >= 65 && val <= 96) {
         System.out.println("Upper Case");
      } else if(val >= 48 && val <= 57) {
         System.out.println("Digit");
      } else if(Character.isWhitespace(val)) {
         System.out.println("Whitespace");
      }
   }
}