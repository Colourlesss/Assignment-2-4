import java.util.Scanner;
public class RunningTally
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int add = 0;
        System.out.println("Let's add some numbers! [type a negative number to quit]");
        while(add >= 0){
            add = sc.nextInt();
            System.out.println("Add: " + add);
            n += add;
        }
        n-=add;
        System.out.println("Your total is " +n);
    }
}
