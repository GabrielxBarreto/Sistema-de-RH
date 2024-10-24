package com.AppRH.AppRH.Models;


import java.io.Serializable;// transforma os obj em binario para manipular e vice versa
import java.util.List;
import jakarta.persistence.CascadeType;// deleta a tabela e suas informações 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue; // id automatico 
import jakarta.persistence.GenerationType; // id automatico
import jakarta.persistence.Id;// identifica o id
import jakarta.persistence.OneToMany;// relacionamento de cardinalidade
import jakarta.validation.constraints.NotEmpty;
@Entity
public class Vaga implements Serializable {
    private static final long serialVersionUID = 1L;// verifica se a versão do obj é compativel com a versao da class
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;
    @NotEmpty
    private String nome;
    @NotEmpty
    private String descricao;
    @NotEmpty
    private String data;
    @NotEmpty
    private String salario;
    @OneToMany(mappedBy = "vaga",cascade = CascadeType.REMOVE) // uma vaga tem muitos candidatos
    private List<Candidato> candidato;

    public List<Candidato> getCandidatos() {
        return candidato;
    }
    public long getCodigo() {
        return codigo;
    }
    public String getData() {
        return data;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getNome() {
        return nome;
    }
    public String getSalario() {
        return salario;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidato = candidatos;
    }
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }

}
