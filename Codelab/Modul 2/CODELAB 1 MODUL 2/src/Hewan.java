public class Hewan {

    String Nama;
    String Jenis;
    String Suara;

    public Hewan(String nama, String jenis, String suara) {
        this.Nama = nama;
        this.Jenis = jenis;
        this.Suara = suara;
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + Nama);
        System.out.println("Jenis: " + Jenis);
        System.out.println("Suara: " + Suara);
    }
}
