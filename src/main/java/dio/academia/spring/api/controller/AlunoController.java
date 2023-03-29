package dio.academia.spring.api.controller;

import dio.academia.spring.api.entity.Aluno;
import dio.academia.spring.api.entity.form.AlunoForm;
import dio.academia.spring.api.service.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl alunoService;

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form) {
        return this.alunoService.create(form);
    }

    @GetMapping
    public List<Aluno> getAll() {
        return alunoService.getAll();
    }
}
