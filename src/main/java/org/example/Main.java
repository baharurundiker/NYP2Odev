package org.example;

public class Main {
    public static void main(String[] args) {
        // Bina oluşturma
        Bina yBina = new Bina("123 örnek sk.");
        yBina.setBinaIsmi("Kardelen");
        yBina.setKatSayisi(5);
        yBina.bilgileriGoruntule();

        // Ev Sahibi oluşturma
        evSahibi evSahibi = new evSahibi("Bahar", "Üründiker", yBina);

        // Daire oluşturma ve Ev Sahibine ekleme
        Daire daire1 = new Daire("123 örnek sk. karpuz apt", 1);
        Daire daire2 = new Daire("123 örnek sk. portakal apt.", 2);

        evSahibi.apartmanEkle(daire1);
        evSahibi.apartmanEkle(daire2);

        // Kiracı oluşturma ve Ev Sahibine bağlama
        Kiraci kiraci = new Kiraci("Emine", "Zengin",yBina);
        kiraci.apartmanEkle(new Daire("123 örnek sk. portakal apt.", 2));

        // Bilgileri ekrana yazdırma


        evSahibi.bilgileriGoruntule();
        kiraci.bilgileriGoruntule();
    }
}
