package org.example;

public class Main {
    public static void main(String[] args) {
        // Bina oluşturma
        Bina bina = new Bina("123 örnek sk.");
        bina.setBinaIsmi("Kardelen");
        bina.setKatSayisi(5);

        // Ev Sahibi oluşturma
        evSahibi evSahibi = new evSahibi("Bahar", "Üründiker", bina);

        // Daire oluşturma ve Ev Sahibine ekleme
        Daire daire1 = new Daire("123 örnek sk. karpuz apt", 1);
        Daire daire2 = new Daire("123 örnek sk. portakal apt.", 2);

        evSahibi.apartmanEkle(daire1);
        evSahibi.apartmanEkle(daire2);

         // Kiracı oluşturma ve Ev Sahibine bağlama
        Kiraci kiraci = new Kiraci("Emine", "Zengin", bina);
        kiraci.apartmanEkle(new Daire("123 örnek sk. portakal apt.", 2));

        // Bilgileri ekrana yazdırma

        bina.bilgileriGoruntule();
        evSahibi.bilgileriGoruntule();
        kiraci.bilgileriGoruntule();
    }
}
