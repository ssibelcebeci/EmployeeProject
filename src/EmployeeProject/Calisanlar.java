package EmployeeProject;

import java.util.ArrayList;

public class Calisanlar {

    // Buradaki calisanList static cünkü proje calismaya basladiği anda oluşması lazım.
    // Bunu bir veritabani gibi görebiliriz. Calisanlarimizin hepsi bu liste icerisinde yer alacak.
    private static ArrayList<Calisan> calisanList = new ArrayList<>();

    // // Tüm çalışanları almak için
    public static ArrayList<Calisan> getCalisanList() {
        return calisanList;
    }


    public static void addACalisan(Calisan calisan) {

        // TODO Bir çalışan eklemek için gerekli method. addACalisan() methodunu doldurunuz
        calisanList.add(calisan);

    }


    public static void deleteACalisanWithId(String calisanId) {

        // TODO Bir çalışan silmek için gerekli method. deleteACalisanWithId() methodunu doldurunuz
        for (int i = 0; i < calisanList.size(); i++) {
            if (calisanList.get(i).getCalisanId().equalsIgnoreCase(calisanId)) {
                calisanList.remove(i);
                break;
            }
        }
    }


    public static void printDepartmandakiCalisanlar(String departmanKodu) {

        // TODO  Departman kodu verilerek, konsola sadece o departmanda calisanlari yazdirmak için
        //       printDepartmandakiCalisanlar() methodunu doldurunuz
        for (Calisan calis : calisanList) {
            if (calis.getDepartman().getDepartmanKodu().equalsIgnoreCase(departmanKodu)) {
                System.out.println(calis);
            }
        }
    }


    public static void printCalisanlar() {

        // TODO  Calisanlari konsola yazdirmak için printCalisanlar() methodunu doldurun
        for (Calisan calisan : calisanList) {
            System.out.println(calisan);
        }



    }
}

