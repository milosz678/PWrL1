package firstapp;

import java.time.LocalDate;

public class Multi<string> {


    private Index index;
    private int wart;
    private static float cena = (float) 0.05;
    private static float kara = (float) 0.5;

    private final LocalDate dataWyk;
    private static LocalDate data = LocalDate.now();
    private static float koszt;

    private Boolean dostepne = true;
    string autor, wydaw;

    float oplata;


    public Multi (int rok, int misiac, int dzin, string Tytul, string Autor, string Wydaw, int Wart){

        index = new Index();

        //data = LocalDate.now();
        dataWyk = LocalDate.of(rok, misiac, dzin);

        autor = Autor;
        wydaw = Wydaw;

        wart = Wart;
        //System.out.println("Utworzenie obiektu Multi");
    }

    public static float getOplata(){
        LocalDate teraz = LocalDate.now();
        int czasWypo = data.getDayOfYear() - teraz.getDayOfYear();
        czasWypo = 1;
        if(czasWypo < 60){  koszt =  (data.getDayOfYear() - teraz.getDayOfYear())*cena + 5; }
        else{ koszt =  60*cena + (czasWypo-60)*kara; }

        return koszt;
    }

//
    public static void main(String[] args) {
//    Multi test = new Multi(1,1997, 3, 3,"Adonis","albatros", 123);
//    test.getOplata();
     }

    public void getInfo(){
        System.out.println(
                        "\nID: " + Integer.toString(index.getId()) +
                        "\nWartość:\t" + Integer.toString(wart) +
                        "\nData wydania: \t\t" + dataWyk +
                        "\nData wyporzyczenia: " + data +
                        "\nAutor: \t" + autor +
                        "\nWydawictwo: \t" + wydaw);

    }
    public Boolean wyporzycz(){
        if(dostepne) {
            dostepne = false;
            System.out.println("WYPORZYCZONO pozycje: " + index.getId());
        }
        else{
            System.out.println("Nie dostępna pozycja nr: " + index.getId());
        }
        return czyDostepne();
    }

    public void Oddaj(){
        System.out.println("Za wypozycznie należy zapłacić: " + Float.toString(getOplata()) + " zł");
        dostepne = true;


    }
    public Boolean czyDostepne(){
        return dostepne;
    }



}


