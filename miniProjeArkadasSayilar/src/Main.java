public class Main {
    public static void main(String[] args) {
        //iki sayı birbirinin kendisi hariç pozitif bölenleri toplamına eşitse bu sayılara arkadaş sayılar denir.
        //örnek:
        //220’nin kendisi hariç pozitif bölenlerinin toplamı : 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
        //284’ün kendisi hariç pozitif bölenlerinin toplamı : 1 + 2 + 4 + 71 + 142 = 220
        //(220, 284), (1184, 1210), (2620, 2924), (5020, 5564), (6232, 6368), (10744, 10856), (12285, 14595), (17296, 18416), (63020, 76084), ve (66928, 66992)’dir.

        int sayi1 = 222;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2= 0;


        for(int i=1;i<sayi1;i++){
            if((sayi1 % i) == 0) {
                toplam1 = toplam1 + i;
            }
        }

        for(int j=1;j<sayi2;j++){
            if((sayi2 % j) == 0) {
                toplam2 = toplam2 + j;
            }
        }

        if(sayi1 == toplam2 && sayi2 == toplam1){
            System.out.println("(" + sayi1 + "," + sayi2 + ") : ikilisi arkadaş sayılardır.");
        }
        else{
            System.out.println("(" + sayi1 + "," + sayi2 + ") : ikilisi arkadaş sayı değildir.");
        }


    }
}