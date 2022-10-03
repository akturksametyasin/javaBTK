public class Main {
    public static void main(String[] args) {
        char grade = 'G';

        switch (grade) {
            case 'A':
                System.out.print("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.print("Çok güzel : Geçtiniz");
                break;
            case 'C':
                System.out.print("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.print("Fena değil : Geçtiniz");
                break;
            case 'F':
                System.out.print("Maalesef kaldınız");
                break;
            default:
                System.out.print("Geçersiz not girdiniz");
        }
    }
}