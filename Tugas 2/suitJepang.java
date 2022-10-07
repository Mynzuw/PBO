import java.util.Random; import java.util.Scanner;

public class suitJepang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int scoreUser = 0;
        int scoreKom = 0;

        while (true) {
            String[] jkt = {"j", "k", "t"};
            String kom = jkt[new Random().nextInt(jkt.length)];
            String jari;


            while (true) {
                System.out.println("Input jari yang ingin anda taruhkan (j/k/t): ");
                jari = scanner.nextLine();
                if (jari.equals("j") || jari.equals("k") || jari.equals("t")) {
                    break;
                }
                System.out.println(jari + " apaan tuh?");
            }

            System.out.println("Komputer: " + kom);

            if (jari.equals(kom)) {
                System.out.println("Seri... Kok bisa sama sihh??");
            } else if (jari.equals("t")) {
                if (kom.equals("k")) {
                    System.out.println("Nice... Kamu menang");
                    scoreUser++;

                } else if (kom.equals("j")) {
                    System.out.println("Sad... Kamu kalah");
                    scoreKom++;
                }
            } else if (jari.equals("j")) {
                if (kom.equals("t")) {
                    System.out.println("Nice... Kamu menang");
                    scoreUser++;

                } else if (kom.equals("k")) {
                    System.out.println("Sad... Kamu kalah");
                    scoreKom++;
                }
            } else if (jari.equals("k")) {
                if (kom.equals("j")) {
                    System.out.println("Nice... Kamu menang");
                    scoreUser++;

                } else if (kom.equals("t")) {
                    System.out.println("Sad... Kamu kalah");
                    scoreKom++;
                }
            }

            System.out.println("Lagi?  (yes/skip)");
            String maenLagi = scanner.nextLine();

            if (!maenLagi.equals("yes")) {
                break;
            }
            System.out.println("Score kamu : " + scoreUser + "\nScore komputer : " + scoreKom + "\n");
        }

        if (scoreUser > scoreKom)
            System.out.println("Score kamu memimpin");
        else if (scoreKom > scoreUser)
            System.out.println("Kasian... Score kamu lebih rendah");
        else if (scoreUser == scoreKom)
            System.out.println("Wew... Score kita sama");
        System.out.println("Score kamu : " + scoreUser + "\nScore komputer : " + scoreKom + "\n");
    }
}