import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String nama;
        char jenisKelamin;
        int tahunLahir, umur, tahunSekarang;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (L/P): ");
        jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir : ");
        tahunLahir = scanner.nextInt();

        scanner.close();

        tahunSekarang = LocalDate.now().getYear();
        umur = tahunSekarang - tahunLahir;

        String jenisKelaminStr;
        if (jenisKelamin == 'l' || jenisKelamin == 'L') {
            jenisKelaminStr = "Laki-laki";
        } else if (jenisKelamin == 'p' || jenisKelamin == 'P') {
            jenisKelaminStr = "Perempuan";
        }else{
            jenisKelaminStr = "Jenis Kelamin Tidak Valid";
        }

        System.out.println("\nData Diri");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminStr);
        System.out.println("Umur: " + umur + " Tahun");

    }
}