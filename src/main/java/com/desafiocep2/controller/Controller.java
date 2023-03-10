package com.desafiocep2.controller;

import com.desafiocep2.model.CepRecebido;
import com.desafiocep2.model.RetornoViacep;
import com.desafiocep2.service.FreteService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@RestController
@Api("Consulta endereços")
@CrossOrigin(origins = "*")
public class Controller {
    @Autowired
    private FreteService freteService;

    @RequestMapping(value = "v1/consulta-endereco", method = RequestMethod.POST)
    public ResponseEntity<Object> Post(@RequestBody CepRecebido cep) {
        String URI = "https://viacep.com.br/ws/" + cep.getCep() + "/json/";

        RestTemplate restTemplate = new RestTemplate();
        try {
            RetornoViacep retornoViacep = restTemplate.getForEntity(URI, RetornoViacep.class).getBody();
            String estado = retornoViacep.getUf();
            double frete = freteService.calcularFrete(estado);

            retornoViacep.setFrete(frete);

            return ResponseEntity.ok(retornoViacep);
        } catch (HttpClientErrorException.BadRequest ex) {
            return ResponseEntity.badRequest().body(ex.getResponseBodyAsString());
        }
    }

//    public void setRestTemplate(RestTemplate restTemplate) {
//    }
//
//    public void setFreteService(FreteService freteService) {
//    }
}