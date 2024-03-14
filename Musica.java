public class Musica {

    private String nome;
    private Double duracao;


    public Musica(String nome, Double duracao){
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome(){
        return this.nome;
    }

    public Double getDuracao(){
        return this.duracao;
    }
}

