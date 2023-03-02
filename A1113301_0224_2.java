import java.util.Scanner;

public class A1113301_0224_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入攝氏溫度：");
        double A = input.nextDouble();
        double B = (A * 9 / 5) + 32;
        System.out.println(B + " 度華氏。");
    }
}
