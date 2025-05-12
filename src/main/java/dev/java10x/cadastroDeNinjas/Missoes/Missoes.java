package dev.java10x.cadastroDeNinjas.Missoes;

import dev.java10x.cadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class Missoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private char dificuldadeMissao;
    private double pontosXp;
    private NinjaModel ninjaModel;

    public Missoes(){
    }

    public Missoes(char dificuldadeMissao, double pontosXp, String name) {
        this.dificuldadeMissao = dificuldadeMissao;
        this.pontosXp = pontosXp;
        this.name = name;
    }

    public char getDificuldadeMissao() {
        return dificuldadeMissao;
    }

    public void setDificuldadeMissao(char dificuldadeMissao) {
        this.dificuldadeMissao = dificuldadeMissao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPontosXp() {
        return pontosXp;
    }

    public void setPontosXp(double pontosXp) {
        this.pontosXp = pontosXp;
    }
}
