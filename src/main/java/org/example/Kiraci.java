package org.example;

import org.example.Bina;
import org.example.Daire;
import org.example.evSahibi;

public class Kiraci extends evSahibi {
     String kiraciAdi;
     String kiraciSoyadi;
    public Kiraci(String kiraciAdi, String kiraciSoyadi, Bina bina) {
        super(kiraciAdi, kiraciSoyadi, bina);
        this.kiraciAdi = kiraciAdi;
        this.kiraciSoyadi = kiraciSoyadi;
    }


    @Override
    public void bilgileriGoruntule() {
        super.bilgileriGoruntule(); // Ev sahibinin bilgilerini göster
        System.out.println("---Kiracı Bilgileri---");
        System.out.println(("Kiracı Adı " + kiraciAdi));
        System.out.println(("Kiracı Soyadı " + kiraciSoyadi));
        System.out.println("Ev Sahibi Adı " + getAd());
        if (!getDaireler().isEmpty()) {
            Daire kiralikDaire = getDaireler().get(0); // Örnek olarak ilk daireyi alıyoruz, sizin kullanımınıza göre değiştirebilirsiniz.
            System.out.println("Apartman Numarası " + kiralikDaire.getApartmanNumarasi());


        }
    }
}
