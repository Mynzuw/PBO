class Mahasiswa3{
    String nama;
    String nim;

    Mahasiswa3(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama: "+this.nama);
        System.out.println("nim: "+ this.nim);
    }

    // methdo tanpa return dan dengan parameter
    void setnama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return this.nama;
    }
    String getNim(){
        return this.nim;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Mahasiswa3 mahasiswa3 = new Mahasiswa3("ucup","23040");
        System.out.println(mahasiswa3.nama);

        // method
        mahasiswa3.show();
        mahasiswa3.setnama("Jotaro");
        mahasiswa3.show();
        System.out.println(mahasiswa3.getNama());
        System.out.println(mahasiswa3.getNim());

    }
}