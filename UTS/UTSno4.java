import java.text.DecimalFormat;

class UTSno4 {
  double jari2 = 10;        // Atribut
  public double luas() {                    // Method
    double luas = 3.14 * jari2 * jari2;
    return luas;
  }

  public double keliling() {
    double keliling = 2*3.14*jari2;
    return keliling;
  }
}

class Lingkaran extends UTSno4 {
  private double phi = 3.14;    // Atribut
  public static void main(String[] args) {
    //Format desimal
    DecimalFormat decfor = new DecimalFormat("0.00");

    //Objek
    Lingkaran panggil = new Lingkaran();

    //Memanggil jari-jari
    System.out.println("Jari-jari = " + decfor.format(panggil.jari2));
    //Memanggil nilai phi
    System.out.println("Nilai Phi = " + panggil.phi);
    //Menampilkan luas
    System.out.println("Luas = " + decfor.format(panggil.luas()));
    //Menampilkan Keliling
    System.out.println("Keliling = " + decfor.format(panggil.keliling()));
  }
}