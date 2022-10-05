// membuat class sebagai template
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}
public class Main1 {
    public static void main(String[] args) throws Exception {
        // instansiasi/ membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "izat";
        mahasiswa1.NIM ="12983";
        mahasiswa1.jurusan ="teknik";
        mahasiswa1.IPK = 4;
        mahasiswa1.umur = 18;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);


        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "ucup";
        mahasiswa2.NIM ="12983";
        mahasiswa2.jurusan ="teknik";
        mahasiswa2.IPK = 3.7;
        mahasiswa2.umur = 19;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);

    }
}
