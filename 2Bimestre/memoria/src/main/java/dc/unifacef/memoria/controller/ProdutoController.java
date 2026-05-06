package dc.unifacef.memoria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @GetMapping
    public String mensagem (){
        return "Bem Vindo a Loja de Memórias";
    }

}
