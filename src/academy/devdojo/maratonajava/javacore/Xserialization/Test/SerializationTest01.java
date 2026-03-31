package academy.devdojo.maratonajava.javacore.Xserialization.Test;

import academy.devdojo.maratonajava.javacore.Xserialization.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Xserialization.domain.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    static void main() {
        Aluno aluno = new Aluno(1L,"João Paulo","24121910");
        Turma turma = new Turma("DevDojo 1910");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }
    public static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno)ois.readObject();
            System.out.println(aluno);
        }
        catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
