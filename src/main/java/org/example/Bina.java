package org.example;

public class Bina extends Konut{
    private String binaIsmi;
    private int katSayisi;

    public Bina(String address) {
        super(address);
        this.binaIsmi = binaIsmi;
        this.katSayisi = katSayisi;
    }
    public String getBinaIsmi() {
        return binaIsmi;
    }

    public void setBinaIsmi(String binaIsmi) {
        this.binaIsmi = binaIsmi;
    }

    public int getKatSayisi() {
        return katSayisi;
    }

    public void setKatSayisi(int katSayisi) {
        this.katSayisi = katSayisi;
    }

    // Bina bilgisini ekrana yazdıran metot
    public void bilgileriGoruntule() {
        System.out.println("---Binanın Bilgileri---");
        System.out.println("Bina Adı " + binaIsmi);
        System.out.println("Kat Sayısı " + katSayisi);
    }


}
