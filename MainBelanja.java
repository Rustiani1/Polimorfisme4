//Overriding
class Buku {
    public void info() {
        System.out.println("Ini adalah buku.");
    }
}

class BukuFiksi extends Buku {
    @Override
    public void info() {
        System.out.println("Ini adalah buku fiksi.");
    }
}

class BukuNonFiksi extends Buku {
    @Override
    public void info() {
        System.out.println("Ini adalah buku non-fiksi.");
    }
}

public class MainBelanja {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        Buku buku2 = new BukuFiksi();
        Buku buku3 = new BukuNonFiksi();
        
        buku1.info();
        buku2.info();
        buku3.info();
    }
}
