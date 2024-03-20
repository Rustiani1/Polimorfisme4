//Overriding
class Jurusan {
    public void info() {
        System.out.println("Ini adalah jurusan di sebuah perguruan tinggi.");
    }
}

class TeknikInformatika extends Jurusan {
    @Override
    public void info() {
        System.out.println("Ini adalah jurusan Teknik Informatika.");
    }
}

class TeknikSipil extends Jurusan {
    @Override
    public void info() {
        System.out.println("Ini adalah jurusan Teknik Sipil.");
    }
}

public class MainJurusanKuliah {
    public static void main(String[] args) {
        Jurusan jurusan1 = new Jurusan();
        Jurusan jurusan2 = new TeknikInformatika();
        Jurusan jurusan3 = new TeknikSipil();
        
        jurusan1.info();
        jurusan2.info();
        jurusan3.info();
    }
}
