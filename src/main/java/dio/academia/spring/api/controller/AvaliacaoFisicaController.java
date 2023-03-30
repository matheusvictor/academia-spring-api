package dio.academia.spring.api.controller;

import dio.academia.spring.api.entity.AvaliacaoFisica;
import dio.academia.spring.api.entity.form.AvaliacaoFisicaForm;
import dio.academia.spring.api.service.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl avaliacaoFisicaService;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
        return this.avaliacaoFisicaService.create(form);

    }

}
