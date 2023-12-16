package org.example;

 abstract public class Konut {

  String adres;
  public Konut(String address) {
        this.adres = adres;
  }
  public String getAdres() {
   return adres;
  }
  public void setAdres() {
   this.adres = adres;
  }
  public void bilgileriGoruntule() {
   System.out.println("---Konut Bilgileri---");
   System.out.println("Konut Adresi " + adres);
  }



}
