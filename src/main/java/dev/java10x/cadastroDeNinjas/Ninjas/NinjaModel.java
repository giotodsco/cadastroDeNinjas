package dev.java10x.cadastroDeNinjas.Ninjas;

import dev.java10x.cadastroDeNinjas.Missoes.Missoes;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int idade;
    private List<Missoes> missoes;

    private double pontosXp = 0;

    public NinjaModel(){
    }

    public NinjaModel(int idade, String name, String email, double pontosXp) {
        this.idade = idade;
        this.name = name;
        this.email = email;
        this.pontosXp = pontosXp;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPontosXp(double pontosXp) {
        this.pontosXp = pontosXp;
    }

    public double getPontosXp() {
        return pontosXp;
    }

    public void setMissoes(List<Missoes> missoes) {
        this.missoes = missoes;
    }

    public List<Missoes> getMissoes() {
        return missoes;
    }
}
