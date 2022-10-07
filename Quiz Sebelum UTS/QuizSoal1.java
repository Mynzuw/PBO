import java.util.Scanner;

public class QuizSoal1 {
    //atribut
    private double a;
    private double t;

    //method
    public double setA(double alas) {
        this.a = alas;
        return alas;
    }

    public double getA() {
        return this.a;
    }

    public double setT(double tinggi) {
        this.t = tinggi;
        return tinggi;
    }

    public double getT() {
        return this.t;
    }


    public double luas() {
        return 0.5 * this.a * this.t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuizSoal1 Segitiga = new QuizSoal1();
        System.out.print("Masukkan Alas : ");
        Segitiga.setA(sc.nextDouble());
        System.out.print("Masukkan Tinggi : ");
        Segitiga.setT(sc.nextDouble());
        System.out.println("Luas Segitiga : " + Segitiga.luas());
    }
}