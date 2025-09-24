/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ikmal
 */

import java.util.ArrayList;

public class Minuman extends Produk implements BisaDinilai {
    private String ukuran;//bisa ditambahkan final kalau misal gada perubahan(cuman di inialisasikan sekali)
    private ArrayList<Integer> ratings = new ArrayList<>();//bisa ditambahkan final kalau misal gada perubahan(cuman di inialisasikan sekali)

    public Minuman(String namaProduk, double harga, String ukuran) {
        super(namaProduk, harga);
        this.ukuran = ukuran;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Minuman: " + getNamaProduk());
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp" + getHarga());
    }

    @Override
    public void beriRating(int nilai) {
        ratings.add(nilai);
    }

    @Override
    public double getRataRataRating() {
        if (ratings.isEmpty()) return 0;
        int total = 0;
        for (int n : ratings) total += n;
        return (double) total / ratings.size();
    }
}

