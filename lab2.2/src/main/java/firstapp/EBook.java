package firstapp;

public class EBook<string> extends Multi {
    public double dlugosc;
    public string lektor;



    public EBook(int rok, int misiac, int dzin, string Tytul, string Autor, string Wydaw, int Wart, double Dlugosc, string Lektor) {
        super(rok, misiac, dzin, Tytul, Autor, Wydaw, Wart);

        dlugosc = Dlugosc;
        lektor = Lektor;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("Dlugość: " +  dlugosc);
        System.out.println("Lektor: " +  lektor);



    }
}
