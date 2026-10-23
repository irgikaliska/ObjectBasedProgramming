package Week07;

class Manusia {
    public void bernafas() {
        System.out.println("Manusia bernafas");
    }

    public void makan() {
        System.out.println("Manusia makan");
    }
}

class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen makan di kantin dosen");
    }

    public void lembur() {
        System.out.println("Dosen lembur");
    }
}

class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan di kantin kampus");
    }

    public void tidur() {
        System.out.println("Mahasiswa tidur");
    }
}
public class TestManusia {
    public static void main(String[] args) {
        Manusia m;

        m = new Dosen();
        m.bernafas();
        m.makan();

        m = new Mahasiswa();
        m.bernafas();
        m.makan();
    }
}
