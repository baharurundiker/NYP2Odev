package org.example;

public class Daire extends Konut implements Comparable<Daire> {
    private int apartmanNumarasi;

    public Daire(String address, int apartmanNumarasi) {
        super(address);
        this.apartmanNumarasi = apartmanNumarasi;
    }

    public int getApartmanNumarasi() {
        return apartmanNumarasi;
    }
    public void setApartmanNumarasi() {
        this.apartmanNumarasi = apartmanNumarasi;
    }

    // Soyut metot: Her alt sınıf bu metodu implement etmek zorunda
    public void bilgileriGoruntule() {

    }

    // Daire nesnelerini karşılaştırmak için compareTo metodu
    @Override
    public int compareTo(Daire otherDaire) {
        // Daire numaralarını karşılaştırıp sonucu döndürüyoruz
        return Integer.compare(this.apartmanNumarasi, otherDaire.getApartmanNumarasi());
    }
}
