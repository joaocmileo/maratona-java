package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.domain;

public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    private Local local;


    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos){
        this(titulo);
        this.alunos = alunos;
    }

    public void imprime(){
        System.out.println(this.titulo);
        if(alunos != null){
            for(Aluno aluno: alunos){
                System.out.println("-".repeat(15));
                System.out.println(aluno.getNome());
            }
        }
        System.out.println();
        System.out.println("Local Do Seminario");
        System.out.println(this.local.getEndereco());
    }


    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
