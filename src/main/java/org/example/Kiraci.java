package org.example;

import org.example.Bina;
import org.example.Daire;
import org.example.evSahibi;

public class Kiraci extends evSahibi {

    public Kiraci(String ad, String soyad, Bina bina) {
        super(ad, soyad, bina);
    }

    @Override
    public void bilgileriGoruntule() {
        super.bilgileriGoruntule(); // Ev sahibinin bilgilerini göster
        System.out.println("---Kiracı Bilgileri---");
        System.out.println("Ev Sahibi Adı " + getAd());
        if (!getDaireler().isEmpty()) {
            Daire kiralikDaire = getDaireler().get(0); // Örnek olarak ilk daireyi alıyoruz, sizin kullanımınıza göre değiştirebilirsiniz.
            System.out.println("Apartman Numarası " + kiralikDaire.getApartmanNumarasi());


        }
    }
}
