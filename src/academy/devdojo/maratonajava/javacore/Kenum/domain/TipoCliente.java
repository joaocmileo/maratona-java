package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2,"Pessoa Jurídica");

    public final int valor;
    public final String nomeRelatorio;


    TipoCliente(int valor,String nomeRelatorio){
        this.nomeRelatorio = nomeRelatorio;
        this.valor = valor;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipo: values()){
            if (tipo.getNomeRelatorio().equals(nomeRelatorio)){
                return tipo;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
