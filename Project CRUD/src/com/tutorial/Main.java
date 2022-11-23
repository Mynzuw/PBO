    package com.tutorial;

    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;
    import java.util.Scanner;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws IOException {

            Scanner terminalInput = new Scanner(System.in);
            String pilihanUser;
            boolean isLanjutkan = true;

            while (isLanjutkan) {
                clearScreen();
                System.out.println("Database Perpustakaan\n");
                System.out.println("1.\tLihat seluruh buku");
                System.out.println("2\tCari data buku");
                System.out.println("3.\tTambah data buku");
                System.out.println("4.\tUbah data buku");
                System.out.println("%.\tHapus data buku");

                System.out.print("\n\nPilihan anda: ");
                pilihanUser = terminalInput.next();

                switch (pilihanUser) {
                    case "1" -> {
                        System.out.println("\n=================");
                        System.out.println("LIST SELURUH BUKU");
                        System.out.println("=================");
                        tampilkanData();
                    }
                    // tampilkan data
                    case "2" -> {
                        System.out.println("\n=========");
                        System.out.println("CARI BUKU");
                        System.out.println("=========");
                    }
                    // cari data
                    case "3" -> {
                        System.out.println("\n================");
                        System.out.println("TAMBAH DATA BUKU");
                        System.out.println("================");
                    }
                    // tambah data
                    case "4" -> {
                        System.out.println("\n==============");
                        System.out.println("UBAH DATA BUKU");
                        System.out.println("==============");
                    }
                    // ubah data
                    case "5" -> {
                        System.out.println("\n===============");
                        System.out.println("HAPUS DATA BUKU");
                        System.out.println("===============");
                    }
                    // hapus data
                    default -> System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-5]");
                }
                isLanjutkan = getYesorNo("Apakah anda ingin melanjutkan");
            }
        }

        private static void tampilkanData() throws IOException{
            FileReader fileInput;
            BufferedReader bufferInput;

            try {
                fileInput = new FileReader("database.txt");
                bufferInput = new BufferedReader(fileInput);
            }catch (Exception e){
                System.err.println("Database tidak ditemukan");
                System.err.println("Silahkan tambah data terlebih dahulu");
                return;
            }


            System.out.println("\n| No |\tTahun  |\tPenulis               |\tPenerbit                        |\tJudul Buku");
            System.out.println("------------------------------------------------------------------------------------------------");

            String data = bufferInput.readLine();
            int nomorData = 0;
            while(data != null) {
                nomorData++;

                StringTokenizer stringToken = new StringTokenizer(data, ",");//Untuk menampilkan per kata dengan akhiran  ","

                stringToken.nextToken();

                System.out.printf("| %2d ", nomorData);
                System.out.printf("|\t%4s   ", stringToken.nextToken());
                System.out.printf("|\t%-20s  ", stringToken.nextToken());
                System.out.printf("|\t%-30s  ", stringToken.nextToken());
                System.out.printf("|\t%s  ", stringToken.nextToken());
                System.out.print("\n");

                data = bufferInput.readLine();
            }
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("Akhir Dari Database");
        }

        private static boolean getYesorNo(String  message) {
            Scanner terminalInput = new Scanner(System.in);
            System.out.println("\n" + message + " [y/n]?");
            String pilihanUser = terminalInput.next();


            while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
                System.err.println("Pilihan anda bukan y atau n");
                System.out.println("\n" + message + " [y/n]?");
                pilihanUser = terminalInput.next();
            }

            return pilihanUser.equalsIgnoreCase("y");
        }

        private static void clearScreen() {
            try {
                if (System.getProperty("os.name").contains("Windows")){
                    new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                }
                else {
                    System.out.print("\033\143");
                }
            } catch (Exception ex){
                System.out.println("tidak bisa clear screen");
            }
        }
    }
