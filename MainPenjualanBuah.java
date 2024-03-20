//Overriding
class Buah {
    public void info() {
        System.out.println("Ini adalah sebuah buah.");
    }
}

class Apel extends Buah {
    @Override
    public void info() {
        System.out.println("Ini adalah buah apel.");
    }
}

class Jeruk extends Buah {
    @Override
    public void info() {
        System.out.println("Ini adalah buah jeruk.");
    }
}

public class MainPenjualanBuah {
    public static void main(String[] args) {
        Buah buah1 = new Buah();
        Buah buah2 = new Apel();
        Buah buah3 = new Jeruk();
        
        buah1.info();
        buah2.info();
        buah3.info();
    }
}
