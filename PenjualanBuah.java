//Overloading
public class PenjualanBuah {
    public void hitungTotal(int hargaSatuan, int jumlah) {
        int total = hargaSatuan * jumlah;
        System.out.println("Total harga: " + total);
    }
    
    public void hitungTotal(int hargaSatuan, int jumlah, double diskon) {
        double total = (hargaSatuan * jumlah) * (1 - diskon);
        System.out.println("Total harga setelah diskon: " + total);
    }
    
    public static void main(String[] args) {
        PenjualanBuah penjualan = new PenjualanBuah();
        penjualan.hitungTotal(5000, 3);
        penjualan.hitungTotal(5000, 3, 0.1);
    }
}
