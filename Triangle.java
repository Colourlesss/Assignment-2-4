import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What character do you want your triangle made of? ");
        char a = sc.nextLine().charAt(0);
        System.out.print("How tall do you want your triangle? ");
        int b = sc.nextInt();
        for(int i = 1;i<=b;i++){
            for(int j = 0;j<i;j++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
