package firstapp;

public class Index {
    private static int id_number = 0;
    private final int id;

    public  Index(){
        id = id_number;
        id_number++;
    }
    public int getId(){
        return this.id;
    }
}
