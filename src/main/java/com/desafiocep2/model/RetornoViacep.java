package com.desafiocep2.model;


/*{

"cep": "01001-000",
"rua": "Praça da Sé",
"complemento": "lado ímpar",
"bairro": "Sé",
"cidade": "São Paulo",
"estado": "SP",
"frete": 7.85


    }*/
public class RetornoViacep {
    String cep;
    String logradouro;
    String complemento;
    String bairro;
    String localidade;
    String uf;
    Double frete;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setRua(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }

    @Override
    public String toString() {
        return "RetornoViacep{" +
                "cep='" + cep + '\'' +
                ", rua='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + localidade + '\'' +
                ", estado='" + uf + '\'' +
                ", frete='" + frete + '\'' +
                '}';
    }
}
