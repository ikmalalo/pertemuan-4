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

public class MakananBerat extends Produk implements BisaDinilai {
    private String jenisMakanan; //bisa ditambahkan final kalau misal gada perubahan(cuman di inialisasikan sekali)
    private ArrayList<Integer> ratings = new ArrayList<>();  //bisa ditambahkan final kalau misal gada perubahan(cuman di inialisasikan sekali)

    public MakananBerat(String namaProduk, double harga, String jenisMakanan) {
        super(namaProduk, harga);
        this.jenisMakanan = jenisMakanan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Makanan Berat: " + getNamaProduk());
        System.out.println("Jenis: " + jenisMakanan);
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

