import java.util.Scanner;

public class sistemLoginSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih login: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan:");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            String tigaDigitNimAkhir = "107";

            if (username.equals("Admin" + tigaDigitNimAkhir) && password.equals("Password" + tigaDigitNimAkhir)) {
                System.out.println("Login Admin berhasil!");
            }else{
                System.out.println("Login gagal! Username atau password salah");
            }

        }else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            String namaValid = "Fikri Fernanda Aqila";
            String nimValid = "202410370110107";

            if (nama.equals(namaValid) && nim.equals(nimValid)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            }else{
                System.out.println("Login gagal! Nama atau NIM salah");
            }
        }else{
            System.out.println("Pilihan anda tidak valid");
        }
        scanner.close();
    }
}