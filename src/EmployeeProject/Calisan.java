package EmployeeProject;

public class Calisan {

    private String calisanId;
    private String adSoyad;
    private int maas;
    private static Departman Departman;
    private String isimKodu = "";
// Merhaba Dünya
    public Calisan(String adSoyad, int maas, String departmanKodu) {
        this.adSoyad = adSoyad;
        this.maas = maas;
        setDepartman(departmanKodu);
        this.setCalisanId();    // constructor çalıştığında, aşağıda tanımlayacağınız bu metod vasıtasıyla tekil bi ID alacak...
        // Örn: Şirkette 257 calisan var, Bilişim teklonojileri departmaninda Mehmet Ali Bulut kaydedilecek olsun,
        // Mehmet Ali icin ID 'BTD258MAB' olmalıdır.
        Calisanlar.addACalisan(this);
    }

    // Terminalden girilen calisanin departman koduna göre, gerekli departman set edilmelidir.
    // Çalışan sınıfının Constructor 'ı main'de tanımlı. Program çalıştığında, terminalden gireceğimiz
    // departman kodu, buradaki metod (setDepartman) vasıtasıyla departman listesinin tümünü dolaşıp (foreach)
    // getDepartmanKodu() ile bulunan sonuçlardan biriyle aynı mı? Diye bakıyoruz...
    // Aynıysa, "terminalden girilen çalışanı bu departmana set et" demektir...
    private void setDepartman(String departman) {
        // TODO setDepartman() methodunu doldurunuz
        for (Departman d : Departmanlar.getDepartmanList()) {
            if (d.getDepartmanKodu().equalsIgnoreCase(departman)) {
               Departman = d;
                break;
            }
        }

        //  Terminalden girilen calisanin departman koduna göre, gerekli departman set edilmelidir.
        //  Çalışan sınıfının Constructor 'ı main'de tanımlı. Program çalıştığında, terminalden gireceğimiz
        //  departman kodu, buradaki metod (setDepartman) vasıtasıyla departman listesinin tümünü dolaşıp (foreach)
        //  getDepartmanKodu() ile bulunan sonuçlardan biriyle aynı mı? Diye bakıyoruz...
        //  Aynıysa, "terminalden girilen çalışanı bu departmana set et" demektir...
        //  İpucu: Departman listesinin (Veritabani.Departmanlar.DepartmanList) içerisindeki departmanların kodları var,
        //  bu kodlari donguye tutmak ise yarayabilir.
    }
    // Hiiiii
    // byeeee


    private void setCalisanId() {
        // TODO setCalisanId() methodunu doldurunuz
        // Calisanin ID sinin kendisine özel olduğundan bahsetmistik,
        // ID nin nasil kaydedileceği Readme Dosyasi içerisinde yer aliyor.
        int sayi=Calisanlar.getCalisanList().size()+1;
        this.calisanId=this.Departman.getDepartmanKodu()
                +sayi+getCalisanIsimKodu();

    }

    private String getCalisanIsimKodu() {
        // TODO getCalisanIsimKOdu() methodunu doldurunuz
        // Calisanin ID sinin sonuna isim kodu eklenmesi için, ismi parçalayan bir method
        // Basit string metodlari ise isinize cok yarayacaktir fakat dinamik olmasina dikkat edelim...
        // Mesela 2 isim bir soyisim girildiğinde hata vermesin.
        return "";// TODO burayi unutmayin
    }



    // Calisanin id sini almak icin basit getter method
    public String getCalisanId() {
        return this.calisanId;
    }

    // Calisanin departmanini almak icin basit getter method
    public Departman getDepartman() {
        return this.Departman;
    }


    // Departman adini verebilmek için bir method
    public String getDepartmanAdi() {

        // TODO getDepartmanAdi() methodunu doldurunuz
        // İpucu: Departman Kodu YD ise departman adi Yonetim Departmani olarak kaydedilmelidir.



        return Departman.getDepartmanKodu();// TODO burayi unutmayin
    }

    // Calisana zam yapilmasi için gerekli bir method
    public static void zamYap(String calisanId) {

        // TODO zamYap() methodunu doldurunuz
        // İpucu:Calisan ID si kullanilarak yapilmalidir, diğer attributelarin aynilarindan 1 er tane daha olabilirdi.


    }

    // Calisanlari yazdırmak için gerekli bir override
    @Override
    public String toString() {

        // TODO toString() methodunu doldurunuz
        // İpucu: Detayli anlatim EmployeesRequirements.pdf içerisinde.
//Çalışanlar konsola yazdırılırken, sadece Çalışanın ID si, Adi Soyadi, Maaşı, ve
//Departmanının adi bulunmalıdır .
//Örn: "Calisan ID : 'BTD1IK', Isim Soyisim : 'Ilker Kula', Maas : '25000', Departman :
//'Bilişim Teknolojileri Departmanı'"
//(İpucu: toString() methodu ile kolayca yapılabilir .)
        return  "???? " ;// TODO burayi unutmayin




    }
}
