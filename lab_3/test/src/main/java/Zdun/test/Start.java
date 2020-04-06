package Zdun.test;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        int koniec = 0, poczatek = 0, przedzial = 0; // Zmienne odpowiedzialne za przedział w ktorych bedzie tworzona tablica
        boolean sortBombel = true;  // Domyslnie ustawiam sortowanie jako bombelkowe
        boolean czyDorzeWpisano;    // zmienna odpowiedzialna za wykonywanie while w ktorym jest generator tablicy
        do try {    // Sprawdzianie wyjatku
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj liczbę od zaczyna sie tablica : ");
            poczatek = scanner.nextInt();

            System.out.print("Podaj liczbe na ktorej konczy sie tablica : ");
            koniec = scanner.nextInt();

            przedzial = koniec - poczatek;  // sprawdzianie czy przedział nie jest ujemny (ujemny przedzial oznacza zle wpisany poczatek lub koniec)
            if(przedzial <= 0){
                throw new ArithmeticException("Przedzial musi się różnić conajmiej o 1");
            }
            czyDorzeWpisano = true; // jezeli przedzial jest dobry ustawiamy jako 1 aby nizej while sie wykonalo

            System.out.print("Wybierz sposób sortowania: \n1 <- Bombelkowe \n2 <- kubelkowe\n");

            if(scanner.nextInt() == 2){     // Jezeli zostanie wybrany nr.2 wybierane jest inne sortowanie niz bombelkowe. W tym przypadku jedyne mozliwe jest kubełkowe.
                sortBombel = false;
            }


        } catch (InputMismatchException e) {
            System.out.println("BŁĄD"); // jezeli jest jakis balad to while ma sie nie wykonywac (to samo nizej)
            czyDorzeWpisano = false;
        }  catch (ArithmeticException e) {

            System.out.println("BŁĄD");
            czyDorzeWpisano = false;

        } while (!czyDorzeWpisano); // czyDobrzeWpisano jest ustawiane jako 1/0 wyzej na tej podstawie funkca jest lub nie jest wykonywana


        int[] losowe = new int [200];   // tworzenie tablicy na 200 elemntow
        Random generator = new Random();    // Wywolywanie reneratora liczb randomowych

        System.out.print("Przed sortowaniem: ");
        for(int i = 0; i <200; i++){
            losowe[i] = generator.nextInt(przedzial) + poczatek;    // Tworzenie 200 losowych liczb w tabpicy o wybranym przedziale
            System.out.print(losowe[i] + "  ");
        }



        if(sortBombel){ // jezeli sortBable nie zostalo zaprzeczone wykona te funkcje wywolujaca sortowanie bombelkowe, Jezeli zostalo zaprzeczone to wywola kubelkowe
            System.out.print("\nBombelkowe");

            Sortable sotrownia = new Sortable(losowe);
        }

        else {
            System.out.print("\nKubelkowe");
            SortKubelkowe SortKubelkowe = new SortKubelkowe(losowe);
        }
    }
}

