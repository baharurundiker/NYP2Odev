package org.example;

import org.example.Bina;
import org.example.Daire;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class evSahibi {
    private String ad;
    private String soyad;
    private Bina bina;
    private List<Daire> daireler;

    // EvSahibi sınıfının constructor'ı
    public evSahibi(String ad, String soyad, Bina bina) {
        this.ad = ad;
        this.soyad = soyad;
        this.bina = bina;
        this.daireler = new ArrayList<>();
    }

    // Ad özelliğinin getter ve setter metotları
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    // Soyad özelliğinin getter ve setter metotları
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    // Bina özelliğinin getter ve setter metotları
    public Bina getBina() {
        return bina;
    }

    public void setBina(Bina bina) {
        this.bina = bina;
    }

    // Daireler özelliğinin getter ve setter metotları
    public List<Daire> getDaireler() {
        return daireler;
    }

    public void setDaireler(List<Daire> daireler) {
        this.daireler = daireler;
    }

    // EvSahibi'ye daire eklemek için metot
    public void apartmanEkle(Daire daire) {
        daireler.add(daire);
        Collections.sort(daireler); // Daire numarasına göre sıralama
    }

    // EvSahibi bilgisini ekrana yazdıran metot
    public void bilgileriGoruntule() {
        System.out.println("---Ev Sahibinin Bilgileri---");
        System.out.println("Adı Soyadı " + ad + " " + soyad);

        if (bina != null) {
            System.out.println("Bina Bilgisi");
            bina.bilgileriGoruntule();
        } else {
            System.out.println("Bina bilgisi sistemde bulunmuyor.");
        }

        System.out.println("Daireler:");
        if (daireler != null && !daireler.isEmpty()) {
            for (Daire daire : daireler) {
                daire.bilgileriGoruntule();
            }
        } else {
            System.out.println("Daire bilgisi sistemde bulunmuyor.");
        }
    }
}
