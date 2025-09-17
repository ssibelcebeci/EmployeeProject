package SuperHeroesProject;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<String> activeHeroes = new ArrayList<>();
        List<String> allHeroes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        allHeroes.add("Spiderman");
        allHeroes.add("Superman");
        allHeroes.add("Batman");
        allHeroes.add("Wolverine");
        allHeroes.add("WonderWoman");

////////////////////////////////////////////////////////////////////////////////////
        // TODO: Tüm Süper Kahramanları allHeros listesine ekleyin.


        ////////////////////////////////////////////////////////////////////////////////////
        // TODO Kullanıcıya mevcut tüm süper kahramanları göstererek, asagidaki menuyu olusturun
        //      "Süper Kahramanlar gösterisine hoş geldiniz..."
        //      "Mevcut Süper Kahramanlar: " + allHeroes
        //       "Çıkmak için q'ya basın..."

        while (true) {
            System.out.println("Hangi süper kahramanı eklemek istiyorsunuz: ");
            String secim = scanner.nextLine();

            if (secim.equalsIgnoreCase("q")) {
                System.out.println("Program sonlanıyor...");
                break;
            }
            if (allHeroes.contains(secim)) {

                if (activeHeroes.contains(secim)) {
                    System.out.println(secim + " zaten oyunda aktif");
                    continue;
                }
                SuperHeroes heroes=HeroFactory.produceSuperHero(secim);

                if (heroes !=null){
                    heroes.printInfo();
                    heroes.exposeSecretPower();
                    heroes.attack();

                    activeHeroes.add(secim);
                    System.out.println(secim + " oyuna başarıyla eklendi.");
                    System.out.println("Aktif kahramanlar: " + activeHeroes);
                    System.out.println("Aktif olmayan kahramanlar: " + getRemainingHeroes(allHeroes, activeHeroes));
                }
            } else {
                System.out.println("Geçerli bir süper kahraman giriniz..");
            }
        }

/***
 * ### Kahraman Ekleme ve Yönetme:
 * - Kullanıcının seçtiği kahramanın geçerli olup olmadığını kontrol edin.
 * - Eğer geçerliyse, `HeroFactory` sınıfını kullanarak seçilen kahramanı oluşturun.
 * - Kahramanın bilgilerini (`printInfo()`, `attack()`, `exposeSecretPower()`) ekrana yazdırın.
 * - Aktif kahraman listesine bu kahramanı ekleyin ve bu durumu ekrana yazdırın.
 * - Henüz eklenmemiş kahramanları listeleyin ve ekrana yazdırın.
 *
 * ### Diğer Durumlar ve Hata Kontrolleri:
 * - Eğer kullanıcı daha önce seçilmiş bir kahramanı seçerse, buna uygun bir mesaj yazdırın.
 * - Eğer kullanıcı geçersiz bir kahraman adı girerse, buna uygun bir hata mesajı yazdırın.
 */

        ////////////////////////////////////////////////////////////////////////////////////
        // TODO Kullaniciya "Hangi süper kahramanı eklemek istiyorsunuz? " sorusunu sorarak tercihini alin

        //TODO: Eğer girilen isim allHeroes listesinde var da, activeHeroes listesinde yoksa : "... oyuna başarıyla eklendi." yazın;
        // oyunda aktif olan ve oyuna girmemiş tüm kahramanları yazdırın...

        //TODO: Eğer girilen isim activeHeroes listesinde varsa "... zaten oyunda aktif!" yazın;

        //TODO: Eğer girilen isim allHeros listesinde de activeHeroes listesinde de yoksa : "... Lütfen geçerli bir süper kahraman girin..." yazın;

        //NOT: getRemainingHeroes(){} metodunu oyuna girmemiş kahramanlar için kullanabilirsiniz...
    }


    // TODO Bu methodda bir degisiklik yapmayiniz
    private static List<String> getRemainingHeroes(List<String> allHeroes, List<String> activeHeroes) {
        List<String> remainingHeroes = new ArrayList<>(allHeroes);
        remainingHeroes.removeAll(activeHeroes);
        return remainingHeroes;
    }
}

