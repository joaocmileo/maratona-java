package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Funcionario extends Pessoa{
    @Override
    public void salvar() throws FileNotFoundException, LoginInvalidoException{
        System.out.println("Salvando funcionario");
    }
}
