package com.dio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {

    private String nome;
    private String descricao;
    private final LocalDate dataDeInicio = LocalDate.now();
    private final LocalDate dataFinal = dataDeInicio.plusDays(45);

    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataDeInicio() {
        return dataDeInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public String toString() {
        return "BootCamp{" +
                "nome='" + nome + '\'' +
                ", \ndescricao='" + descricao + '\'' +
                ", \ndataDeInicio=" + dataDeInicio +
                ", \ndataFinal=" + dataFinal +
                ", \ndevsInscritos=" + devsInscritos +
                ", \nconteudos=" + conteudos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCampo = (BootCamp) o;
        return Objects.equals(getNome(), bootCampo.getNome()) && Objects.equals(getDescricao(), bootCampo.getDescricao()) && Objects.equals(getDataDeInicio(), bootCampo.getDataDeInicio()) && Objects.equals(getDataFinal(), bootCampo.getDataFinal()) && Objects.equals(getDevsInscritos(), bootCampo.getDevsInscritos()) && Objects.equals(getConteudos(), bootCampo.getConteudos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDataDeInicio(), getDataFinal(), getDevsInscritos(), getConteudos());
    }
}
