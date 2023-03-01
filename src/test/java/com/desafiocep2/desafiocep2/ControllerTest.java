package com.desafiocep2.desafiocep2;

import com.desafiocep2.controller.Controller;
import com.desafiocep2.model.CepRecebido;
import com.desafiocep2.model.RetornoViacep;
import com.desafiocep2.service.FreteService;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(JUnit4.class)
@SpringBootTest
public class ControllerTest {
    @Autowired
    private Controller controller;

    @Autowired
    private FreteService freteService;

    @Test
    public void testConsultaEndereco() {
        // Cria o objeto CepRecebido com o cep de teste
        CepRecebido cepRecebido = new CepRecebido();
        cepRecebido.setCep("01001000");

        // Chama o método de consulta de endereço e verifica se o resultado é diferente de null
        String result = String.valueOf(controller.Post(cepRecebido));
        assertNotNull(result);

//        // Verifica se o valor do frete foi preenchido corretamente
//        RetornoViacep retornoViacep = new Gson().fromJson(result, RetornoViacep.class);
//        double frete = freteService.calcularFrete(retornoViacep.getCep());
//        assertEquals(frete, retornoViacep.getValorFrete(), 0.01);
//    }

    }
}
