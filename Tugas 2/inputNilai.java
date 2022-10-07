import java.util.Scanner;

public class inputNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nilai = "0 1 2 3 4 5 6 7 8 9 10";
        String inputan;
        do {
            System.out.println("Masukkan nilai 0-10");
            inputan = sc.nextLine();
        }
        while (!nilai.contains(inputan));
        System.out.println("Nilai yang anda masukkan : " + inputan);
    }
}
