package dio.academia.spring.api.service;

import dio.academia.spring.api.entity.Aluno;
import dio.academia.spring.api.entity.AvaliacaoFisica;
import dio.academia.spring.api.entity.form.AvaliacaoFisicaForm;
import dio.academia.spring.api.entity.form.AvaliacaoFisicaUpdateForm;
import dio.academia.spring.api.repository.AlunoRepository;
import dio.academia.spring.api.repository.AvaliacaoFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = this.alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        // TODO: Criar regras de execeção para caso ID do aluno não exista
        // TODO: Criar classe para retorno das informações (Ex.: AvaliacaoFisicaResponse), contendo apenas os dados necessários para serem mostrados.
        return this.avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
