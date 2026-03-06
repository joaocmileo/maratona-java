package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;


    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome,especialidade);
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        if(seminarios != null){
            for(Seminario seminario:seminarios){
                System.out.println(seminario);
            }
        }
    }
    public void relatorio(){

        System.out.println("-".repeat(15));
        System.out.println("Professor: "+this.nome);
        if(seminarios == null)return;
        System.out.println("## Seminarios cadastrados ##");
        for (Seminario seminario:seminarios){
            seminario.imprime();
        }


    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminarios;
    }

    public void setSeminario(Seminario seminarios[]) {
        this.seminarios = seminarios;
    }
}
