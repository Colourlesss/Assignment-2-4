import java.util.Scanner;
public class D6V2
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       while(true){
       System.out.print("How many D6's do you want to roll? ");
       int num = sc.nextInt();
       int total = 0;
       System.out.print("You rolled: ");
       for(int i = 0;i<num;i++){
           int rand = (int)(Math.random() * 6 + 1);
           total += rand;
           System.out.print(rand+ " ");
       }
       System.out.println();
       System.out.println("Total: " + total);
       System.out.print("Again? [y,n] ");
       sc.nextLine();
       if(sc.nextLine().charAt(0) == 'n'){
           System.out.println("Good-Bye!");
           break;
       }
    }
   }
}
