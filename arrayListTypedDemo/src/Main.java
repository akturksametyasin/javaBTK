import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.add("Aydın");

        //sehirler.remove(0);
        sehirler.remove("İstanbul");

        Collections.sort(sehirler);     //alfabeye göre sıralama

        for(String sehir : sehirler){
            System.out.println(sehir);
        }
    }
}