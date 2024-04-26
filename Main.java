public class Main {
    public static void main(String[] args) {
        // Membuat objek daftar belanja
        DaftarBelanja belanjaan = new DaftarBelanja();

        // Menambahkan item ke dalam daftar belanja
        belanjaan.tambahItem(new Item("Susu", 15.5));
        belanjaan.tambahItem(new Item("Roti", 10.0));
        belanjaan.tambahItem(new Elektronik("Smartphone", 2000.0, "Android"));
        
        // Menampilkan daftar belanja
        belanjaan.tampilkanDaftar();

        // Menampilkan total belanja
        System.out.println("Total Belanja: $" + belanjaan.totalBelanja());
    }
}
