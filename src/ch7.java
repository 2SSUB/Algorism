import java.util.Scanner;
public class ch7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double A = sc.nextInt();
        double B = sc.nextInt();

        System.out.print(A / B);
        sc.close();
    }
}
