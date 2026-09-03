package Week02;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Sheva";
        mhs2.alamat = "Jl. Ikan Piranha";
        mhs2.kelas = "2I";
        mhs2.tampilBiodata();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 102;
        mhs3.nama = "Tesa";
        mhs3.alamat = "Jl. Papa Kuning";
        mhs3.kelas = "4B";
        mhs3.tampilBiodata();


    }
}
