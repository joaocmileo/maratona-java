package academy.devdojo.maratonajava.javacore.FmodificaresEstaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static{
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }

    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
    }

    public void imprime(){
        System.out.println(this.nome);
        for (int episodio: Anime.episodios){
            System.out.println(episodio);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }
}
