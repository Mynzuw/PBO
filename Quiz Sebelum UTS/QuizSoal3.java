public class QuizSoal3 {
    double biayaMengetik;
    double biayaInternet;
    double biayaScan;
    double biayaPrintWarna;
    double biayaPrintHitamPutih;
    double biayaTehBotol;

    public double getBiayaMengetik() {
        return biayaMengetik;
    }

    public double setBiayaMengetik(double biayaMengetik) {
        this.biayaMengetik = biayaMengetik;
        return biayaMengetik/60*2000;
    }

    public double getBiayaInternet() {
        return biayaInternet;
    }

    public double setBiayaInternet(double biayaInternet) {
        this.biayaInternet = biayaInternet;
        return biayaInternet/60*4000;
    }

    public double getBiayaScan() {
        return biayaScan;
    }

    public double setBiayaScan(double biayaScan) {
        this.biayaScan = biayaScan;
        return biayaScan*1000;
    }

    public double getBiayaPrintWarna() {
        return biayaPrintWarna;
    }

    public double setBiayaPrintWarna(double biayaPrintWarna) {
        this.biayaPrintWarna = biayaPrintWarna;
        return biayaPrintWarna*500;
    }

    public double getBiayaPrintHitamPutih() {
        return biayaPrintHitamPutih;
    }

    public double setBiayaPrintHitamPutih(double biayaPrintHitamPutih) {
        this.biayaPrintHitamPutih = biayaPrintHitamPutih;
        return biayaPrintHitamPutih*300;
    }

    public double getBiayaTehBotol() {
        return biayaTehBotol;
    }

    public double setBiayaTehBotol(double biayaTehBotol) {
        this.biayaTehBotol = biayaTehBotol;
        return biayaTehBotol*3000;
    }

    public double total() {return (this.biayaPrintHitamPutih*300) + (this.biayaPrintWarna*500) + (this.biayaScan*1000) +
            (this.biayaInternet/60*4000) + (this.biayaMengetik/60*2000) + (this.biayaTehBotol*3000);}

    public static void main(String[] args) {
        int lamaMengetik = 40;
        int lamaInternet = 50;
        int lembarScan = 3;
        int lembarPrintWarna = 2;
        int lemberPrintHitamPutih = 3;
        int tehBotol = 1;

        QuizSoal3 HargaSemua = new QuizSoal3();
        System.out.println("Biaya rental komputer");
        System.out.println("Mengetik = " + lamaMengetik + " Menit/60*2000  = " + HargaSemua.setBiayaMengetik(lamaMengetik));
        System.out.println("Internet = " + lamaInternet + " Menit/60*4000 = " + HargaSemua.setBiayaInternet(lamaInternet));
        System.out.println("Biaya Scan = " + lembarScan + " Lembar * 1000  = " + HargaSemua.setBiayaScan(lembarScan));
        System.out.println("Biaya Print Warna = " + lembarPrintWarna + " Lembar * 500 = " + HargaSemua.setBiayaPrintWarna(lembarPrintWarna));
        System.out.println("Biaya Print Hitam Warna = " + lemberPrintHitamPutih +
                " Lembar * 300 = " + HargaSemua.setBiayaPrintHitamPutih(lemberPrintHitamPutih));
        System.out.println("Biaya Teh Botol = " + tehBotol + " Botol * 3000 = " + HargaSemua.setBiayaTehBotol(tehBotol));
        System.out.println("Total Biaya = " + HargaSemua.total());
    }
}
