package academy.devdojo.maratonajava.javacore.Xserialization.domain;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private long id;
    private  String nome;
    private transient String senha;
    private static final String NOME_ESCOLA = "DevDojo";
    private transient Turma turma;

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", turma=" + turma +
                ", nome da escola=" + NOME_ESCOLA +
                '}';
    }

    public Aluno(long id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }
@Serial
    private void writeObject(ObjectOutputStream oos){
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Serial
    private void readObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            this.turma = new Turma(nomeTurma);
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }



    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
