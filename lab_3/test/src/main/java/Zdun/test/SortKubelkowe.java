package Zdun.test;

public class SortKubelkowe implements SortableInterface{

    double step = 0;
    //private int[] tab = new int[200];
    int[] itsTab = new int[200];

    private int zapisCounter = 0;

    public SortKubelkowe(int[] tab) {
        itsTab = this.sort(tab);

    }
    @Override
    public int[] sort(int[] tab){
        int max = tab[0],min = tab[0];
        for(int x: tab){

            if(x<min){ min = x;}
            if(x>max){ max = x;}

        }


        int przedzial = max - min;
        int[] podzial = new int[przedzial+1];

        for (int x : tab) {
            podzial[x - min]++;
            //System.out.print( (x-min) + "  " );
            step_counting();
        }

        System.out.print("\nPo sportowaniu : ");

        for (int i = 0; i < podzial.length; i++) {
            //System.out.print(" Liczba = " + (i+1) + " ilość wysapień " + podzial[i] +  "\n");
            for (int j = 0; j < podzial[i]; j++) {
                zapis(i);
                System.out.print(i + " " );
            }
        }
        System.out.print("\n" + step+ "\n");
        return tab;
    }


    @Override
    public double step_counting(){
        return step++;
    }

    private void zapis(int liczba){
        itsTab[zapisCounter] = (liczba+1);
        zapisCounter++;
    }


}