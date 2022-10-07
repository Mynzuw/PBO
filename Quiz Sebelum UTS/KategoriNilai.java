import java.util.Scanner;
public class KategoriNilai {
    private double nilai;

    public KategoriNilai(){
        this.nilai = 0;
    }
    public void setNilai(double nilai){
        this.nilai = nilai;
    }
    public double getNilai(){
        return this.nilai;
    }

    public double Hitung(){
        double hitung;
        hitung = this.nilai;
        if (nilai > 100) {
            System.out.println("Melebihi nilai maksimum");
        }else if(nilai>=90){
            System.out.println("Nilai Huruf = A");
        }else if(nilai>=80){
            System.out.println("Nilai Huruf = A-");
        }else if(nilai>=75){
            System.out.println("Nilai Huruf = B+");
        }else if(nilai>=70){
            System.out.println("Nilai Huruf = B");
        }else if(nilai>=65){
            System.out.println("Nilai Huruf = B-");
        }else if(nilai>=60){
            System.out.println("Nilai Huruf = C+");
        }else if(nilai>=55){
            System.out.println("Nilai Huruf = C");
        }else if(nilai>=50){
            System.out.println("Nilai Huruf = C-");
        }else if(nilai>=40){
            System.out.println("Nilai Huruf = D");
        }else if(nilai>=0){
            System.out.println("Nilai Huruf = E");
        }
        return hitung;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KategoriNilai obj = new KategoriNilai();
        System.out.print("Masukkan total nilai : ");
        obj.nilai = sc.nextDouble();
        System.out.println("Hasil : ");
        System.out.println("Nilai Angka = "+obj.nilai);
        obj.Hitung();
    }
}