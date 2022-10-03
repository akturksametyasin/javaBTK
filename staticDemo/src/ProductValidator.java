public class ProductValidator {

    static{
        System.out.println("Static yapıcı blok çalıştı.");
    }

    public ProductValidator(){      //sadece ProductManager newlenirse çalışır.
        System.out.println("Yapıcı blok çalıştı.");
    }

    public static boolean isValid(Product product){     //static başka bir classda newlemeden çağırmayı sağlar.
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public void bisey(){

    }

    public static class BaskaBirClass{     //inner class        //ana class(en üstteki class) static yapılamaz. inner class static yapılabilir.
        public static void sil(){

        }
    }
}
