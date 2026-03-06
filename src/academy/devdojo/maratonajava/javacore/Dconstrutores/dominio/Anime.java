package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String produtora;

    public Anime(String nome,String tipo,int episodios,String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public Anime(String nome,String tipo,int episodios,String genero,String produtora){
        this(nome,tipo,episodios,genero);
        this.produtora = produtora;
    }

    public Anime(){

    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        if (this.produtora != null){
            System.out.println(this.produtora);
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getNome(){
        return nome;
    }
    public String getTipo(){
        return tipo;
    }
    public String getGenero(){
        return genero;
    }
    public int getEpisodios(){
        return episodios;
    }
}

