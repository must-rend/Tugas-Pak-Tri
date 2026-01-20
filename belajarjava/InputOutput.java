package com.mycompany.belajarjava;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        // String
        System.out.print("Nama: ");
        String nama = inputUser.nextLine();

        // int
        System.out.print("Absen: ");
        int absen = inputUser.nextInt();

        // double
        System.out.print("Uang Saku: ");
        double saku = inputUser.nextDouble();

        // float
        System.out.print("Tinggi Badan (cm): ");
        float tinggi = inputUser.nextFloat();

        // long
        System.out.print("NIK: ");
        long nik = inputUser.nextLong();

        // short
        System.out.print("Jumlah Saudara: ");
        short saudara = inputUser.nextShort();

        // byte
        System.out.print("Usia: ");
        byte usia = inputUser.nextByte();

        // boolean
        System.out.print("Sudah Lulus? (true/false): ");
        boolean lulus = inputUser.nextBoolean();

        // char
        System.out.print("Jenis Kelamin (L/P): ");
        char jk = inputUser.next().charAt(0);

        System.out.println("\n=== DATA SISWA ===");
        System.out.println("Nama            : " + nama);
        System.out.println("Absen           : " + absen);
        System.out.println("Uang Saku       : " + saku);
        System.out.println("Tinggi Badan    : " + tinggi);
        System.out.println("NIK             : " + nik);
        System.out.println("Jumlah Saudara  : " + saudara);
        System.out.println("Usia            : " + usia);
        System.out.println("Sudah Lulus     : " + lulus);
        System.out.println("Jenis Kelamin   : " + jk);
    }
}
