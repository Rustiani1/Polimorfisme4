//Overloading
public class JurusanKuliah {
    public void tampilkanInfo(String namaJurusan) {
        System.out.println("Informasi jurusan: " + namaJurusan);
    }
    
    public void tampilkanInfo(String namaJurusan, int jumlahMahasiswa) {
        System.out.println("Informasi jurusan " + namaJurusan + " dengan jumlah mahasiswa: " + jumlahMahasiswa);
    }
    
    public static void main(String[] args) {
        JurusanKuliah jurusan = new JurusanKuliah();
        jurusan.tampilkanInfo("Informatika");
        jurusan.tampilkanInfo("Teknik Sipil", 150);
    }
}
