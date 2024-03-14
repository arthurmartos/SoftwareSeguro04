import java.util.ArrayList;

public class Album {
    private String nome;
    private Double ano;
    private ArrayList<Musicas> musica;

    Public Album(String nome, Double ano){
        this.nome = nome;
        this.ano = ano;
        this.musicas = new ArrayList<Musicas>();
    }

    public String getNome(){
        return this.nome;
    }


    public Double getAno(){
        return this.ano;
    }


}
