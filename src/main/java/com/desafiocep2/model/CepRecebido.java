package com.desafiocep2.model;


public class CepRecebido {
    String cep;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "CepRecebido{" +
                "cep='" + cep + '\'' +
                '}';
    }
}
