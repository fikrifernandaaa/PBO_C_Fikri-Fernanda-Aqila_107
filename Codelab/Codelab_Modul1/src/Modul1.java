package Codelab_Modul1;
import java.util.Scanner;
import java.time.LocalDate;

public class Modul1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        char jenisKelamin = sc.next().charAt(0);

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = sc.nextInt();

        sc.close();

        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        String jenisKelaminStr;
        if (jenisKelamin == 'L'|| jenisKelamin == 'l') {
            jenisKelaminStr = "Laki-laki";
        }else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminStr = "Perempuan";
        }else{
            jenisKelaminStr = "Jenis Kelamin Tidak Valid";
        }

        System.out.println("\nData Diri: ");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminStr);
        System.out.println("Umur: " + umur + "tahun");
    }
}