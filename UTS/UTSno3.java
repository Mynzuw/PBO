import java.util.Scanner;

public class UTSno3 {
    static int hitung = 0; // Atribut
    static void looping() { //Method
        for (int i = 1; i <= 10; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input ke-" + i + " = ");
            hitung = hitung + input.nextInt();
        }
    }

    public static void main(String[] args) {
        //Objek
        UTSno3 hitung = new UTSno3();
        //Memanggil Method looping
        looping();
        //Tampilan
        System.out.println(" Hasil seluruh inputan = " + hitung.hitung);
    }
}

