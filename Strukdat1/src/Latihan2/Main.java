package Latihan2;

import java.util.ArrayList; // import

public class Main {
    public static void main(String[] args) {
        ArrayList<Konsumsi<makanan, Minuman>> listKonsumsi = new ArrayList<>(); // deklarasi makanan dan minuman untuk parameter
        Konsumsi<makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<makanan, Minuman> lunch = new Konsumsi<>();

        makanan roti = new makanan();
        roti.setNamaHidangan("Roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setKonsumsi(roti, susu);
        listKonsumsi.add(breakfast);

        makanan nasi = new makanan();
        nasi.setNamaHidangan("Nasi Putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air Putih");
        lunch.setKonsumsi(nasi, air); //tambahan
        listKonsumsi.add(lunch); //tambahan

        for (Konsumsi<makanan, Minuman> konsumsi : listKonsumsi) { //tambahan perulangan melalui listkonsumsi dan mencetak item makanan dan minuman yang dikonsumsi
            System.out.println(konsumsi.getM().disantap() + " dan " + konsumsi.getI().disantap());
        }

    }
}