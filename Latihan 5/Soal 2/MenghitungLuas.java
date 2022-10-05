import java.util.Scanner;

class Segitiga {
    private double alas;
    private double tinggi;


    public void getAlas(double alas) {
        this.alas = alas;
    }


    public void getTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuas() {
        double luas;
        luas = 0.5 * alas * tinggi;
        return luas;
    }
}

class Lingkaran {
    private double jari2;

    public void getJari2(double jari2) {
        this.jari2 = jari2;
    }

    public double getLuas() {
        double luas;
        luas = 3.14 * jari2 * jari2;
        return luas;
    }
}

public class MenghitungLuas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Lingkaran LuasLingkaran = new Lingkaran();
        Segitiga LuasSegitiga = new Segitiga();

        System.out.println("MenghitungLuas Luas Segitiga dan Lingkaran");
        System.out.println("Ketik 1 untuk luas segitiga");
        System.out.println("Ketik 2 untuk luas lingkaran");
        System.out.print("Pilihan Anda : ");
        int ketik = sc.nextInt();

        if (ketik == 1) {
            System.out.print("Masukkan Alas :");
            LuasSegitiga.getAlas(sc.nextDouble());
            System.out.print("Masukkan Tinggi :");
            LuasSegitiga.getTinggi(sc.nextDouble());
            System.out.print("Luas : " + LuasSegitiga.getLuas());
        }

        if (ketik == 2) {
            System.out.print("Masukkan jari-jari :");
            LuasLingkaran.getJari2(sc.nextDouble());
            System.out.print("Luas : " + LuasLingkaran.getLuas());
        }

        else {
            System.out.println("Maaf tidak ada di opsi");
        }
    }
}