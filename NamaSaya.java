package hari1;

import java.util.Scanner;


public class NamaSaya {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Ketik Nama :");
        String nama = scan.nextLine();
        System.out.print("Halo Nama Saya " + nama);
    }
}
