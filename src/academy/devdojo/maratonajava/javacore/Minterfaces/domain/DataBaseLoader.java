package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DataBaseLoader implements DataLoader,DataRemover{
    @Override
    public void load(){
        System.out.println("Carregando dados do BD");
    }
    @Override
    public  void remove(){
        System.out.println("Removendo dados do BD");
    }

    @Override
    public void checkPermission() {
        System.out.println("Fazendo checagem de permissão do BD");
    }

    public static void retrivemaxDataSize(){
        System.out.println("Dentro do retrivemaxDataSize da DBL");
    }
}
