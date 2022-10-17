import java.util.Scanner;
import java.text.DecimalFormat;

public class UTSno2 {

    double berat; //Atribut
    double tinggi;

    public double getBerat() { //Method
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungBMI() {
        double hasilBMI = berat / (tinggi*tinggi);
        return hasilBMI;
    }

    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static void main(String[] args) {
        //Format Desimal
        DecimalFormat decfor = new DecimalFormat("0.00");
        //Input
        Scanner input = new Scanner(System.in);
        //Objek
        UTSno2 panggil = new UTSno2();
        System.out.print("Masukkan berat badan anda (kg): ");
        panggil.setBerat(input.nextDouble()); //input berat
        System.out.print("Masukkan tinggi badan anda (m): ");
        panggil.setTinggi(input.nextDouble()); //input tinggi

        //menampilkan BMI
        System.out.println("BMI anda : " + decfor.format(panggil.hitungBMI()));
        //kondisi if else
        if ((panggil.hitungBMI() >= 18.5) && (panggil.hitungBMI() <= 22.9))
        {System.out.println("Berat badan anda ideal");}

         else if (panggil.hitungBMI() < 18.5)
        {System.out.println("Berat badan anda underweight");}

        if (panggil.hitungBMI() > 22.9)
        {System.out.println("Berat badan anda overweight");}


    }
}
