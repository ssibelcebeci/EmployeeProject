package CoffeMachineProject;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scannerStr = new Scanner(System.in);
    static Scanner scannerInt = new Scanner(System.in);
    ArrayList<KahveBoyutu> kahveBoyutus = new ArrayList<>();
    ArrayList<KahveTurleri> kahveTurleris = new ArrayList<>();
    String sut;
    int sekerAdedi;

    public CoffeeMachine() {
    }

    public void kahveSecim() {

        boolean Secim = false;
        int secim;
        do {
            System.out.println("Kahvenizi seçiniz: ");
            System.out.println("1-Americano");
            System.out.println("2-Espresso");
            System.out.println("3-Cappucino");
            System.out.println("4-Latte");
            System.out.println("5-Mocha");
            System.out.println("6-Macchiato");
            System.out.println("7-Affogato");
            System.out.println("8-Buzlu Kahve");
            System.out.println("9-Frappucino");
            System.out.println("10-Irish");

            secim = scannerInt.nextInt();

            switch (secim) {
                case 1:
                    kahveTurleris.add(KahveTurleri.AMERICANO);
                    Secim = true;
                    break;
                case 2:
                    kahveTurleris.add(KahveTurleri.ESPRESSO);
                    break;
                case 3:
                    kahveTurleris.add(KahveTurleri.CAPPUCINO);
                    Secim = true;
                    break;
                case 4:
                    kahveTurleris.add(KahveTurleri.LATTE);
                    Secim = true;
                    break;
                case 5:
                    kahveTurleris.add(KahveTurleri.MOCHA);
                    Secim = true;
                    break;
                case 6:
                    kahveTurleris.add(KahveTurleri.MACCHIATO);
                    Secim = true;
                    break;
                case 7:
                    kahveTurleris.add(KahveTurleri.AFFOGATO);
                    Secim = true;
                    break;
                case 8:
                    kahveTurleris.add(KahveTurleri.BUZLU_KAHVE);
                    Secim = true;
                    break;
                case 9:
                    kahveTurleris.add(KahveTurleri.FRAPPUCINO);
                    Secim = true;
                    break;
                case 10:
                    kahveTurleris.add(KahveTurleri.IRISH);
                    Secim = true;
                    break;
                default:
                    System.out.println("Geçersiz seçim, program sonlandırılıyor.");
                    return;
            }
        } while (!Secim);
        boyutSecim();
        sutSecimi();
        sekerSecimi();
        tumSecimler();
    }

    public void boyutSecim() {
        int secim;
        boolean Secim = false;

        do {
            System.out.println("Lütfen aşağıdaki menüden kahvenizin boyutunu seçiniz:");
            System.out.println("1-Small\n2-Medium\n3-Large\n4-XLarge");
            secim = scannerInt.nextInt();


            switch (secim) {
                case 1:
                    kahveBoyutus.add(KahveBoyutu.SMALL);
                    Secim = true;
                    break;
                case 2:
                    kahveBoyutus.add(KahveBoyutu.MEDIUM);
                    Secim = true;
                    break;
                case 3:
                    kahveBoyutus.add(KahveBoyutu.LARGE);
                    Secim = true;
                    break;
                case 4:
                    kahveBoyutus.add(KahveBoyutu.XLARGE);
                    Secim = true;
                    break;
                default:
                    System.out.println("Geçersiz seçim, program sonlandırılıyor.");
                    return;
            }
        } while (!Secim);

    }

    public void sutSecimi() {
        System.out.println("Kahvenize süt eklemek ister misiniz? (Evet/Hayır)");
        sut = scannerStr.nextLine();

        if (sut.equalsIgnoreCase("evet")) {
            System.out.println("Kahvenize süt ekleniyor, lütfen bekleyin...");
        } else {
            System.out.println("Kahveniz sütsüz hazırlanıyor...");
        }
    }

    public void sekerSecimi() {
        System.out.println("Kahvenize şeker ister misiniz?");
        String sekerTercih = scannerStr.nextLine();


        if (sekerTercih.equalsIgnoreCase("Evet")) {
            System.out.println("Kaç şeker istersiniz?");
            sekerAdedi = scannerInt.nextInt();
        } else {
            System.out.println("Kahveniz şekersiz hazırlanıyor.");
        }
    }

    public void tumSecimler() {
        System.out.println("Siparişinizin özeti:");
        System.out.println("Kahve seçimi: " + kahveTurleris);
        System.out.println("Boyut seçimi: " + kahveBoyutus);
        System.out.println("Süt" + (sut.equalsIgnoreCase("evet") ? " evet" : " hayır"));
        System.out.println("Şeker" + (sekerAdedi > 0 ? sekerAdedi : " şekersiz hazırlanıyor."));

    }
}
