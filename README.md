# Nesneye  Yönelik Programlama Ödevi 2  / Ev Yönetim Sistemi 

Bu proje Bahar Üründiker tarafından yapılmıştır. 1220505018
Bu ev yönetim sistemi uygulaması, bir binadaki ev sahipleri, kiracılar, daireler ve bina bilgilerini yönetmek için uml sınıf diyagramlarından yardım alınarak tasarlanmıştır.

## İçindekiler

- [Genel Bakış](#genel-bakış)
  - [Gereksinimler](#gereksinimler)
- [Kullanım](#kullanım)
- [Proje Yapısı](#proje-yapısı)


## Genel Bakış

Bu uygulama, bir bina içindeki ev sahiplerini, kiracıları, daireleri ve bina bilgilerini temsil eden Java sınıflarını içerir.
Her bir sınıf, belirli bir özelliği temsil eder ve bu özellikler arasındaki ilişkiler, ödev listesinde verilen UML sınıf diyagramında görüldüğü gibi implemente edilmiştir.
Nesneye yönelik uygulamanın özelliklerinin **hepsinden** faydalanılmıştır.

## Proje Yapısı
Proje şu şekilde organize edilmiştir:

`src/:`
`org.example/:`
`Bina.java`
`Daire.java`
`evSahibi.java`
`Kiraci.java`
`Main.java`

### Gereksinimler

- Java IDE (Eclipse, IntelliJ IDEA vb.) Ben IntelliJ IDEA kullandım.
- Java SDK

## Kullanım 
Uygulama başlatıldığında, örnek bir bina, ev sahibi, kiracı ve daire oluşturulacaktır. Bu örnekler üzerinden ev yönetim sistemi özelliklerini test edebilirsiniz.

Bina Oluşturma:

Bina sınıfını kullanarak yeni bir bina oluşturabilirsiniz.

`Bina yeniBina = new Bina("123 Main St.");`

evSahibi sınıfını kullanarak yeni bir ev sahibi oluşturabilir ve bir binaya bağlayabilirsiniz.

`evSahibi yeniEvSahibi = new evSahibi("Ahmet", "Yılmaz", yeniBina);`
Daire Oluşturma ve Bağlama:


`Daire yeniDaire = new Daire("123 Main St., Apt 1", 1);`
`yeniEvSahibi.apartmanEkle(yeniDaire);`
Kiracı Oluşturma ve Bağlama:

Kiraci sınıfını kullanarak yeni bir kiracı oluşturabilir ve bir ev sahibine bağlayabilirsiniz.

`Kiraci yeniKiraci = new Kiraci("Ayşe", "Kaya", yeniBina);`
`yeniKiraci.apartmanEkle(new Daire("123 Main St., Apt 2", 2));`

![ezgif-2-ed8df21412](https://github.com/baharurundiker/NYP2Odev/assets/77542846/a976cc14-049c-4aa1-a2aa-ec165ac09bc1)


