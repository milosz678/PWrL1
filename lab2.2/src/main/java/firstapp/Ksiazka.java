package firstapp;

public class Ksiazka<string> extends Multi{
    public static int ileStr;
    public static double ocena;

    public Ksiazka( int rok, int misiac, int dzin, string Tytul, string Autor, string Wydaw, int Wart, int IleStr, double Ocena) {
        super( rok, misiac, dzin, Tytul, Autor, Wydaw, Wart);
        ileStr = IleStr;
        ocena = Ocena;


       // System.out.println("Wypożyczono książkę");
    }
    public void getInfo(){
        super.getInfo();
        System.out.println(  );


    }
}
