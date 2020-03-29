package firstapp;

public class Plyty<string>  extends  Multi{

    public static int ilioscPiosenek;
    public static int iloscSprzedanychPlyt;


    public Plyty(int rok, int misiac, int dzin, string Tytul, string Autor, string Wydaw, int Wart, int IlioscPiosenek, int IloscSprzedanychPlyt) {
        super(rok, misiac, dzin, Tytul, Autor, Wydaw, Wart);

        ilioscPiosenek = IlioscPiosenek;
        iloscSprzedanychPlyt  = IloscSprzedanychPlyt;

    }
    public void getInfo(){
        super.getInfo();
        System.out.println(
                "\nIlość piosenek: " + ilioscPiosenek +
                "\nIlość sprzedanych płyt: " +    iloscSprzedanychPlyt
        );
    }
}
