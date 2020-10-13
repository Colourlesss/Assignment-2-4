import java.util.Scanner;
public class GuessingGame
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("I have picked a random nuber between 1 and 100. Try to guess it!");
        int rand = (int)(Math.random() * 99 + 1);
        int tries = 0;
        while(true){
            System.out.print("What is your guess? ");
            int ans = sc.nextInt();
            tries++;
            if(ans>rand){
                System.out.println("Too high...");
            }else if(ans<rand){
                System.out.println("Too low...");
            }else{
                System.out.println("Good job! it has only taken you " + tries + " tries");
                break;
            }
        }
    }
}
