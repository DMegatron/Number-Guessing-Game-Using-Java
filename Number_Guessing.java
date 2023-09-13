import java.util.Scanner;
import java.util.Random;
public class Number_Guessing {
    public static void main(String[] args){
        System.out.println();
        System.out.println("Computer has guessed a number between 1-100. You've to find that number.\nIn Hard mode you've 5 guesses. In easy mode you've 10 guesses.\nYou can have 9 possible outcomes.\n1.Your guess is way too big!     2.Your guess is very big!\n3.Your guess is big!             4.Your guess is just a little bit big!\n5.Your guess is way too small!   6.Your guess is very small!\n7.Your guess is small!           8.Your guess is just a little bit small!\n9.Your guess is correct!");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(1,101);
        int count=0,n=0;
        System.out.println();
        System.out.print("Select game level(Hard/Easy):");
        String level = scan.next();
        if(level.equalsIgnoreCase("hard")){
            count=5;
        }
        else if(level.equalsIgnoreCase("easy")){
            count=10;
        }
        else{
            System.out.println("Invalid level selection!");
        }
        for(int i=1; i<=count; i++){
        System.out.print("Enter your guess:");
        int input = scan.nextInt();
        if(input>x){
            if((input-x) <= 99 && (input-x) >= 69){
                System.out.println("Your guess is way too big!");
            }
            else if((input-x) < 69 && (input-x) >= 39){
                System.out.println("Your guess is very big!");
            }
            else if((input-x) < 39 && (input-x) >= 9){
                System.out.println("Your guess is big!");
            }
            else if((input-x) < 9 && (input-x) > 0){
                System.out.println("Your guess is just a little bit big!");
            }
            else{
                System.out.println("Invalid input!");
                i++;
            }
            System.out.println("You've "+(count-i)+" guesses left.");
            System.out.println();
        }
        else if(x>input){
            if((x-input) <= 99 && (x-input) >= 69){
                System.out.println("Your guess is way too small!");
            }
            else if((x-input) < 69 && (x-input) >= 39){
                System.out.println("Your guess is very small!");
            }
            else if((x-input) < 39 && (x-input) >= 9){
                System.out.println("Your guess is small!");
            }
            else if((x-input) < 9 && (x-input) > 0){
                System.out.println("Your guess is just a little bit small!");
            }
            else{
                System.out.println("Invalid input!");
                i++;
            }
            System.out.println("You've "+(count-i)+" guesses left.");
            System.out.println();
        }
        else{
            System.out.println("Your guess is correct!");
            n++;
            break;
        }
    }
        if(n == 0){
        System.out.println("The correct answer is "+x);
        }
        scan.close();
    }
}
