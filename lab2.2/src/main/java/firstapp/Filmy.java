package firstapp;

public class Filmy<string> extends  Multi{

    public string scenarzysta;
    public int iloscOscarow;




    public Filmy( int rok, int misiac, int dzin, string Tytul, string Autor, string Wydaw, int Wart, string Scenarzysta, int IloscOscarow) {
        super( rok, misiac, dzin, Tytul, Autor, Wydaw, Wart);

        scenarzysta = Scenarzysta;
        iloscOscarow = IloscOscarow;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("Scenarzysta: " +  scenarzysta);
        System.out.println("Ilość oskarów:" + iloscOscarow);
    }
}
