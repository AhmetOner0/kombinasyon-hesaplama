package patikadev;
import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r;
        int total1=1,total2=1,total3=1,total4;


        System.out.print("n sayısı giriniz:");
        n = sc.nextInt();
        for (int i = 1;i <= n;i++){
            total1 *= i;
        }
        System.out.println("n faktöriyel:"+total1);

        System.out.print("r sayısı giriniz:");
        r = sc.nextInt();

        for (int t=1;t<=r;t++){
            total2 *=t;
        }
        System.out.println("r faktöriyel:"+total2);
        int s = n - r;

        for (int d=1;d<=s;d++){
            total3 *= d;
        }
        System.out.println("n-r'nin faktöriyeli:"+total3);
        total4 = total1 / (total2 * total3);
        System.out.print("sonuç:"+total4);
    }
}
