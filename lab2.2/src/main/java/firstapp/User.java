package firstapp;

import java.util.List;

//import java.util.List<pl.filip.firstapp.Multi>;


public class User<String>{
    public String name;
    public String surname;
    public String phone;
    public String adress;
    public int[] hired = new int [3];
    public int hireCouter = 0;


    public User(String Name,String Surname,String Phone, String Adress ){
        name  = Name;
        surname = Surname;
        phone = Phone;
        adress = Adress;
    }

    public float calyDlug(List<Multi> LMulti) {
        float calosc = 0;
        for(int i: hired){
            if(i!=0) {
                calosc += LMulti.get(i).getOplata();
            }
        }
        return calosc;

    }

    public void Hire(int id, List<Multi> LMulti){
        if(!LMulti.get(id).czyDostepne()){
            System.out.println("Pozycja niedostępna");

        }
        else if(hireCouter >= 3 ){

            System.out.println("Użytkownik " + name + " " + surname + " musi oddać to co wyporzyczył!!");
            System.out.println("Wyporzyczone "+ hired[0]+ ", " + hired[1] + ", " + hired[2]);
        }
        else if( calyDlug(LMulti)>=20 ) {
            System.out.println("Użytkownik " + name + " " + surname + " musi opłacić zaległości!!" +  calyDlug(LMulti));
            System.out.println("Wyporzyczone "+ hired[0]+ ", " + hired[1] + ", " + hired[2]);
        }
        else{
            LMulti.get(id).wyporzycz();
            hired[hireCouter] = id;
            hireCouter++;
            System.out.println("Prawodłowo wyporzyczono pozycje");
        }
    }

}
