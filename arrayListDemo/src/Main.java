import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");

        System.out.println(sayilar.size());

        System.out.println(sayilar.get(2));

        //sayilar.set(0,100);     //0. indexi 100 olarak değiştirir.
        //System.out.println(sayilar.get(0));

        //sayilar.remove(0);      //0. indexi tamamen siler, 1. index 0'a geçer ve eleman sayısı 2'ye iner.
        //System.out.println(sayilar.get(0));

        //sayilar.clear();        //listeyi sıfırlar eleman kalmaz.

        for(Object i : sayilar){
            System.out.println(i);
        }
    }
}