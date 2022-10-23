import java.util.Scanner;
import java.text.DecimalFormat;

public class TugasMandiriPBO {
    double lembur;
    double gajiPokok;
    double tunjangan;
    double potongPajak;
    int golongan;

    private static final DecimalFormat decfor = new DecimalFormat("0.00");

    public void gajiLembur() {
        Scanner input = new Scanner(System.in);
        System.out.print("Berapa jam anda sudah bekerja? : ");
        int jamKerja = input.nextInt();
        int jamLembur = jamKerja - 173;
        lembur = jamLembur * 20000;
        if (jamLembur > 0) {
            System.out.println("Anda sudah lembur sudah lemmbur selama : " + jamLembur);
            System.out.println("Gaji lembur anda sebanyak : Rp" + decfor.format(lembur));
        } else {
            System.out.println("Anda tidak lembur");
        }
    }

    public void golonganKami() {
        Scanner input = new Scanner(System.in);
        System.out.print("Anda berada di golongan berapa? (1-4): ");
        golongan = input.nextInt();
        if (golongan==1) {
            gajiPokok = 1486500;
            tunjangan = 250000;
            potongPajak = ((gajiPokok + tunjangan) - ((gajiPokok*0.005) + (tunjangan*0.005)));
        }
        else if (golongan==2) {
            gajiPokok = 1926000;
            tunjangan = 300000;
            potongPajak = ((gajiPokok + tunjangan) - ((gajiPokok*0.005) + (tunjangan*0.005)));
        }

        else if (golongan==3) {
            gajiPokok = 2456700;
            tunjangan = 350000;
            potongPajak = ((gajiPokok + tunjangan) - ((gajiPokok*0.005) + (tunjangan*0.005)));
        }

        else if (golongan==4) {
            gajiPokok = 2899500;
            tunjangan = 400000;
            potongPajak = ((gajiPokok + tunjangan) - ((gajiPokok*0.005) + (tunjangan*0.005)));
        }

        else {
            System.out.println("Anda bukan golongan kami");
            System.exit(0);

        }
    }

    public static void main(String[] args) {
        TugasMandiriPBO tampilkan = new TugasMandiriPBO();
        System.out.println("=======================Informasi Gaji=============================");
        System.out.println("==================================================================");
        tampilkan.golonganKami();
        System.out.println("==================================================================");
        tampilkan.gajiLembur();
        System.out.println("==================================================================");
        double pokok = tampilkan.gajiPokok;
        double tunjang = tampilkan.tunjangan;
        double potongPajak1 = tampilkan.potongPajak;
        System.out.println("Gaji pokok : Rp" + decfor.format(pokok));
        System.out.println("Tunjangan : Rp" + decfor.format(tunjang));
        System.out.println("Gaji pokok dan tunjangan(potong pajak 0,5%) : Rp" + decfor.format(potongPajak1));
        System.out.println("Total gaji yang anda terima(+bonus lemmbur) : Rp" + decfor.format(tampilkan.lembur+potongPajak1));
        System.out.println("==================================================================");
    }
}
