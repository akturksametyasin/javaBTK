public class Main {
    public static void main(String[] args) {
        //mükemmel sayı: kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayı.
        //mükemmel sayı örnekleri: 6, 28, 496, 8128, 33550336

        int number = 5;
        int total = 0;

        for (int i=1;i<number;i++){
            if((number % i) == 0){
                total = total + i;
            }
        }

        if(total == number){
            System.out.println(number + " : Mükemmel sayıdır.");
        }
        else{
            System.out.println(number + " : Mükemmel sayı değildir.");
        }
    }
}