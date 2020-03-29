package firstapp;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        //Multi klasa nadrzędna
        Multi multi1 = new Multi(1999, 5, 4,"Tyyuł","nie znany","nowa era", 123); //wywoływanie nowego obiektu
        multi1.getOplata();
        multi1.getInfo();
        List <Multi> LMulti = new ArrayList<Multi>();
        LMulti.add(multi1);

        //AudioBook
        Multi audioBook = new AudioBook(1969, 3,2,"legenda","Emilio", "stara era", 321, 123.4, 8);
        audioBook.getInfo();
        audioBook.getOplata();
        LMulti.add(audioBook);


        //EBook
        Multi ebook = new EBook( 1841, 2, 8, "pocophone","Pablo Eskobar", "Kuba", 100, 356, "Piotr frączewski");
        ebook.getInfo();
        LMulti.add(ebook);


        //Filmy
        Multi film1 = new Filmy(1422,3,1,"Szklana Pływania", "Krulik bugs", "Warner Bros", 1200, "Kaczor Donald", 3 );
        film1.getInfo();
        LMulti.add(film1);



        //Książka
        Multi ksiazka1 = new Ksiazka(1212, 2,3,"co w trawie piszczy ","Nie pamientam", "Mrówka", 123, 80, 5.5);
        ksiazka1.getInfo();
        LMulti.add(ksiazka1);

        //Płyta
        Multi abba = new Plyty(2013,8,1,"Jest juz za pozno","3 w nocy", "Rodło", 500, 10, 1000000);
        abba.getInfo();
        LMulti.add(abba);


        User user1 = new User("Karol", "Zaborowski", "123-123-123", "Dagraso 1");
        User user2 = new User("Miłosz", "Zalewski", "123-123-123", "Telepizza 2");
        User user3 = new User("Wojtek", "Gruby", "123-123-123", "Pizza Hut 3");
        User user4 = new User("Chenryk", "Benek", "123-123-123", "Kondominjum Niemiecko-Rosyjskie 4");


        user1.Hire(1, LMulti);
        user1.Hire(2, LMulti);
        user1.Hire(1, LMulti);
        user1.Hire(3, LMulti);


    }


}
