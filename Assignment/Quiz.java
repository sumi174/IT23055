import java.util.Scanner;

public class Quiz{
  public static void main(String[] args){
    System.out.println("Welcome To The Quize.");
    System.out.println("What is the capital of Denmark?");
     System.out.println("A. Lisbon");
     System.out.println("B. Copenhagen");
     System.out.println("C. Oslo");
     System.out.println("4. Moscow");
     Scanner sc = new Scanner(System.in);
     int score=0;
     char choice = sc.next().charAt(0);

      if (choice == 'b' || choice == 'B') {     
     System.out.println("Correct!");
     score++;
     }else{
       System.out.println("Wrong!  Correct Answer is option B.Copenhagen");}

     System.out.println("What is the longest river in the world?");
     System.out.println("A. Nile");
     System.out.println("B. Tigris");
     System.out.println("C. Ganges");
     System.out.println("D. Padma");
      choice = sc.next().charAt(0);

      if (choice == 'a' || choice == 'A'){

     System.out.println("Correct!");
     score++;
     }else{
       System.out.println("Wrong!  Correct Answer is option A.Nile");}

     System.out.println("Which planet is known as the Red Planet?");
     System.out.println("A. Mars");
     System.out.println("B. Earth");
     System.out.println("C. Jupiter");
     System.out.println("D. Venus");
      choice = sc.next().charAt(0);
       if (choice == 'a' || choice == 'A'){
     System.out.println("Correct!");
     score++;
     }else{
       System.out.println("Wrong!  Correct Answer is option A.Mars");}
     System.out.println("Who was the first President of the United States?");
     System.out.println("A. Thomas Jefferson");
     System.out.println("B. George Washington");
     System.out.println("C. Abraham Lincoln");
     System.out.println("D. John Adams");

     choice = sc.next().charAt(0);
    if (choice == 'a' || choice == 'A'){
    System.out.println("Correct!");
    score++;
     }else{
       System.out.println("Wrong!  Correct Answer is option A.Thomas Jefferson");}
     System.out.println("\nWhat is the largest ocean on Earth?");
        System.out.println("A. Atlantic Ocean");
        System.out.println("B. Indian Ocean");
        System.out.println("C. Arctic Ocean");
        System.out.println("D. Pacific Ocean");
        choice = sc.next().charAt(0);

        if (choice == 'd' || choice == 'D') {
            System.out.println("Correct!");
            score++;  // Increase score for correct answer
        } else {
            System.out.println("Wrong! Correct Answer is option D: Pacific Ocean");
        }

        // Show total score
        System.out.println("\nYour total score is: " + score + "/5");

        sc.close(); 
      

  }
}