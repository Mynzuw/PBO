import java.util.Scanner;

public class mencariKata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kataFrase = null;
        String kalimat = "kalau dilakukan dengan sepenuh hati maka besi batangan pun kalau digosok terus menerus akan menjadi jarum";
        System.out.println(kalimat);
        do {
            System.out.println("Masukkan kata/frase yang ada pada kalimat di atas!");
            kataFrase = sc.nextLine();
        }
        while (!kalimat.contains(kataFrase));
        System.out.println("Kata/frasa ditemukan!!!");
        System.out.println("Kata/frasa yang anda masukkan : " + kataFrase);
    }
}
