import java.util.Scanner;

public class Tugas222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        
        int totalSemuaAngka = 0;
        
        if (n >= 3) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int hasil = i * j;
                    System.out.printf("%4d", hasil);
                    totalSemuaAngka += hasil;
                }
                System.out.println();
            }
            System.out.println("Jumlah seluruh angka: " + totalSemuaAngka);
        } else {
            System.out.println("Nilai n minimal 3.");
        }
        sc.close();
    }
}