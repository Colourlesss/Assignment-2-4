import java.util.Scanner;
public class Bar
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What character do you want your bar made of?");
        char a = sc.nextLine().charAt(0);
        System.out.print("How long do you want your bar?");
        int b = sc.nextInt();
        for(int i = 0;i<b;i++){
            System.out.print(a);
        }
    }
}
