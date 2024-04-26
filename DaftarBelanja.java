import java.util.ArrayList;

// Class utama untuk item belanja
class Item {
    private String nama;
    private double harga;

    public Item(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nama='" + nama + '\'' +
                ", harga=" + harga +
                '}';
    }
}

// Subclass untuk item elektronik
class Elektronik extends Item {
    private String jenis;

    public Elektronik(String nama, double harga, String jenis) {
        super(nama, harga);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    @Override
    public String toString() {
        return "Elektronik{" +
                "nama='" + getNama() + '\'' +
                ", harga=" + getHarga() +
                ", jenis='" + jenis + '\'' +
                '}';
    }
}

// Kelas utama untuk daftar belanja
class DaftarBelanja {
    private ArrayList<Item> daftarItem;

    public DaftarBelanja() {
        daftarItem = new ArrayList<>();
    }

    public void tambahItem(Item item) {
        daftarItem.add(item);
    }

    public void tampilkanDaftar() {
        System.out.println("Daftar Belanja:");
        for (Item item : daftarItem) {
            System.out.println(item);
        }
    }

    public double totalBelanja() {
        double total = 0;
        for (Item item : daftarItem) {
            total += item.getHarga();
        }
        return total;
    }
}

class Main {
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
