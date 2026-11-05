import java.util.Scanner;

public class Tugas322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
        
        int totalBarangSemuaToko = 0;
        int tokoTerbanyak = 0;
        int maxBarangToko = -1;

        if (jumlahToko >= 1) {
            for (int i = 1; i <= jumlahToko; i++) {
                System.out.print("Masukkan jumlah pelanggan Toko " + i + ": ");
                int pelanggan = sc.nextInt();
                
                int totalBarangTokoIni = 0;
                
                for (int j = 1; j <= pelanggan; j++) {
                    System.out.print("  Jumlah barang pelanggan " + j + ": ");
                    int barang = sc.nextInt();
                    totalBarangTokoIni += barang;
                }
                
                System.out.println("Toko " + i + " pelanggan: " + pelanggan + ", total barang: " + totalBarangTokoIni);
                
                totalBarangSemuaToko += totalBarangTokoIni;
                
                if (totalBarangTokoIni > maxBarangToko) {
                    maxBarangToko = totalBarangTokoIni;
                    tokoTerbanyak = i;
                }
            }
            
            System.out.println("========================================");
            System.out.println("Total barang seluruh toko: " + totalBarangSemuaToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        } else {
            System.out.println("Jumlah toko minimal 1.");
        }
        
        sc.close();
    }
}