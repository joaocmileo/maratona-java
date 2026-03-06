package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;

    public abstract void load();

    default void checkPermission(){
        System.out.println("Fazendo a checagem de permissão");}
    public static void retriveMaxDataSize(){
        System.out.println("Dentro do maxDataSize da interface");
    }
}
