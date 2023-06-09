package dio.academia.spring.api.service;

import dio.academia.spring.api.entity.Aluno;
import dio.academia.spring.api.entity.AvaliacaoFisica;
import dio.academia.spring.api.entity.form.AlunoForm;
import dio.academia.spring.api.entity.form.AlunoUpdateForm;
import dio.academia.spring.api.infra.utils.JavaTimeUtils;
import dio.academia.spring.api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        this.alunoRepository.save(aluno);
        return aluno;
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll(String dataDeNascimento) {
        if (dataDeNascimento == null) return this.alunoRepository.findAll();
        else return this.alunoRepository
                .findByDataDeNascimento(
                        LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER)
                );
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaById(Long id) {
        Aluno aluno = this.alunoRepository.findById(id).get();
        return aluno.getAvaliacoes();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
