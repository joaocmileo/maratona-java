package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader,DataRemover{
    @Override
    public void load(){
        System.out.println("Carregando dados de um Arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Arquivo");
    }
    @Override
    public void checkPermission(){
        System.out.println("Fazendo a checagem de permissão dos arquivos");
    }
}
