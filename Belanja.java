//Overloading
public class Belanja {
    public void hitungTotal(int hargaBarang, int jumlahBarang) {
        int total = hargaBarang * jumlahBarang;
        System.out.println("Total harga belanja: " + total);
    }
    
    public void hitungTotal(int hargaBarang, int jumlahBarang, double diskon) {
        double total = (hargaBarang * jumlahBarang) * (1 - diskon);
        System.out.println("Total harga belanja setelah diskon: " + total);
    }
    
    public static void main(String[] args) {
        Belanja belanja = new Belanja();
        belanja.hitungTotal(5000, 3);
        belanja.hitungTotal(5000, 3, 0.1);
    }
}
