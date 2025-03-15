public class Main {
    public static void main(String[] args) {

        RekeningBank rekening1 = new RekeningBank("202410370110107", "Fikri", 2000000);
        RekeningBank rekening2 = new RekeningBank("202410370110100", "Haidar", 1500000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setorUang(250000);
        rekening2.setorUang(500000);

        System.out.println();
        rekening1.tarikUang(100000);
        rekening2.tarikUang(200000);

        System.out.println();
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}