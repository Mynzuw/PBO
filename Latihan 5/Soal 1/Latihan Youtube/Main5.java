class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
    void display(){
        System.out.println("\nJudul\t: "+ this.judul);
        System.out.println("\nPenulis\t: "+ this.penulis);
    }
}
public class Main5 {
    public static void main(String[] args) {
        Buku databuku1 = new Buku("Art Of War","Sun Tzu");

        databuku1.display();

        // menampilkan address
        String addressbuku1 = Integer.toHexString(System.identityHashCode(databuku1));
        System.out.println(addressbuku1);

        // assignment object
        Buku databuku2 = new Buku("Art Of War","Sun Tzu");
        databuku2.display();
        String addressbuku2 = Integer.toHexString(System.identityHashCode(databuku2));
        System.out.println(addressbuku2);

        // buku1 dan buku2 memiliki addres yang sama atau referensi yang sama
        databuku1.judul = "Seni Berperang";
        databuku1.display();
        databuku2.display();

        // memasukkan object ke dalam method
        fungsi(databuku2);
        databuku1.display();
        databuku2.display();
    }
    public static void fungsi(Buku dataBuku){
        String addressbuku2 = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println(addressbuku2);
        dataBuku.penulis = "Sun Tzu";
    }
}