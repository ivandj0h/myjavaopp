package com.tutorial;

// Membuat Class sebagai template untuk menampilkan output
class Profile {
    String nama;
    String alamat;
    int umur;

    // Constructor tanpa parameter
    Profile() {
        System.out.println("ini adalah constructor tanpa parameter");
    }

    // Constructor dengan parameter
    Profile(String nama, String alamat, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;

        System.out.println("Nama : " + this.nama);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("Umur : " + this.umur);
    }

}

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Membuat objek dari class Profile
        new Profile("Budi", "Jakarta", 20);
        
    }
}
