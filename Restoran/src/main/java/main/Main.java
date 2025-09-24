/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import model.BisaDinilai;
import model.MakananBerat;
import model.Minuman;
import model.Produk;

/**
 *
 * @author ikmal
 */

public class Main {
    public static void main(String[] args) {
        // Polymorphism: variabel Produk bisa menampung MakananBerat atau Minuman
        Produk nasiGoreng = new MakananBerat("Nasi Goreng Spesial", 25000, "Pedas");
        Produk ayamGeprek = new MakananBerat("Ayam Geprek", 30000, "Ayam");
        Produk esTeh = new Minuman("Es Teh Manis", 5000, "Medium");
        Produk kopi = new Minuman("Kopi Hitam", 10000, "Large");

        // Tampilkan info
        nasiGoreng.tampilkanInfo();
        System.out.println("-----------------------");
        ayamGeprek.tampilkanInfo();
        System.out.println("-----------------------");
        esTeh.tampilkanInfo();
        System.out.println("-----------------------");
        kopi.tampilkanInfo();
        System.out.println("=======================");

        // Memberi rating
        ((BisaDinilai)nasiGoreng).beriRating(9);
        ((BisaDinilai)nasiGoreng).beriRating(4);

        ((BisaDinilai)kopi).beriRating(3);
        ((BisaDinilai)kopi).beriRating(4);

        System.out.println("Rata-rata rating Nasi Goreng: " + ((BisaDinilai)nasiGoreng).getRataRataRating());
        System.out.println("Rata-rata rating Kopi: " + ((BisaDinilai)kopi).getRataRataRating());
    }
}

