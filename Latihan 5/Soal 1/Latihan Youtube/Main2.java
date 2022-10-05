// class tanpa constructor
class Polos{
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa1{
    String nama;
    String Nim;
    String Jurusan;

    // constructor dipanggil saat object pertama kali dibuat
    Mahasiswa1(){
        System.out.println("Ini adalah constructor");
    }
    // constructor dengan parameter

}
class Mahasiswa2{

    String nama;
    String nim;
    String Jurusan;

    Mahasiswa2(String inputNama, String inputnim, String inputJurusan){
        nama = inputNama;
        nim = inputnim;
        Jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(nim);
        System.out.println(Jurusan);
    }
}

public class Main2 {
    public static void main(String[] args) throws Exception {
        Polos objectPolos = new Polos();
        objectPolos.dataString = "Polos";
        objectPolos.dataInteger = 9;

        System.out.println(objectPolos.dataString);
        System.out.println(objectPolos.dataInteger);


        // setelah menggunakan class constructor
        Mahasiswa1 mahasiswa1 = new Mahasiswa1();
        // bisa juga menggunakan
        // new Mahasiswa();
        Mahasiswa2 mahasiswa2 = new Mahasiswa2("ucup","23094","teknik");
        System.out.println(mahasiswa2.nama);

    }
}