package dev.thallesrafael.currencycoverter.models;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Moedas {
    private  String name;
    private LocalDateTime ultimaAtualizacao;
    private Map<String, Double> convercoes;


    public Moedas(String name, LocalDateTime ultimaAtualizacao, Map<String, Double> convercoes) {
        this.name = name;
        this.ultimaAtualizacao = ultimaAtualizacao;
        this.convercoes = convercoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public Map<String, Double> getConvercoes() {
        return convercoes;
    }

    public void setConvercoes(Map<String, Double> convercoes) {
        this.convercoes = convercoes;
    }

    @Override
    public String toString() {
        return "Moedas{" +
                "name='" + name + '\'' +
                ", ultimaAtualizacao=" + ultimaAtualizacao +
                ", convercoes=" + convercoes +
                '}';
    }
}