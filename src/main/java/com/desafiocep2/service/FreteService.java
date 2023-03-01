package com.desafiocep2.service;

import org.springframework.stereotype.Service;

@Service
public class FreteService {
    public double calcularFrete(String estado) {
        switch (estado.toUpperCase()) {
            case "SP":
            case "RJ":
            case "ES":
            case "MG":
                return 7.85;
            case "DF":
            case "GO":
            case "MT":
            case "MS":
                return 12.50;
            case "AL":
            case "BA":
            case "CE":
            case "MA":
            case "PB":
            case "PE":
            case "PI":
            case "RN":
            case "SE":
                return 15.98;
            case "PR":
            case "RS":
            case "SC":
                return 17.30;
            case "AC":
            case "AM":
            case "AP":
            case "PA":
            case "RO":
            case "RR":
            case "TO":
                return 20.83;
            default:
                return 0.0;
        }
    }
}
