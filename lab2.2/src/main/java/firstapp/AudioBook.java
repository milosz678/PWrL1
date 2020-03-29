package firstapp;

public class AudioBook<string> extends  Multi{


    public static double rozmiar;
    public static double ocena;



    public AudioBook(int rok, int misiac, int dzin, string Tytul, string Autor, string Wydaw, int Wart, double RozmiarPliku, double Ocena) {
        super(rok, misiac, dzin, Tytul, Autor, Wydaw, Wart);

        rozmiar = RozmiarPliku;
        ocena = Ocena;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("\nAudio Book GetInfo:");
        System.out.println("\nRozmiar pliku: "  + Double.toString(rozmiar) +
                           "\nOcena: " +    Double.toString(ocena));
    }
}
