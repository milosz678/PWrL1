package Zdun.test;

public class Sortable implements SortableInterface {
    private int i = 0;
    private int temp;
    private int step = 0;
    private int [] itsTab = new int[200];


    @Override
    public double  step_counting(){
        return step++;
    }
    public Sortable(int[] tab){
        itsTab = this.sort(tab);
    }


    @Override
    public int[] sort(int[] tab){   // standardowe sortowane bombelkowe
        i = 0;
        for (int i = 0; i < 200; i++) {

            for (int j = 0; j < 199; j++) {
                if (tab[j] > tab[j+1]){
                    temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j + 1] = temp;
                    step++;
                }
            }
        }

        System.out.print("\nPo sportowaniu: ");

        for (int i = 0; i < tab.length; i++) {  // drukowanie tablicy posortowanej
            System.out.print(tab[i] +"  ");
        }
        System.out.println(""); // zaczeecie nowej lini
        System.out.println(step);   // wyswietlenie liczby kroków
        return tab;
    }




}
