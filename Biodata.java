/*
 * 1. Analisis Spesifikasi kebutuhan Sistem
 * a. Spesifikasi kebutuhan input data ke sistem
 *      - nim : String
 *      - nama : String
 * b. Spesifikasi kebutuhan output data dari sistem
 *      - nim
 *      - nama
 * c. Rekayasa Proses
 *      - inputData(String a, String b): void
 *      - viewData(): void
 */
package LatihanClass3;
public class Biodata {
    private String nim;
    private String nama;

    public void inputData(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
    public void viewData() {
        System.out.println("Nim: " + this.nim);
        System.out.println("Nama: " + this.nama);
    }
}
