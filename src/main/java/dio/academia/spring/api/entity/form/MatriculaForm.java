package dio.academia.spring.api.entity.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class MatriculaForm {

  @NotNull(message = "Preencha o campo corretamente.")
  @Positive(message = "O ID do aluno precisa ser positivo.")
  private Long alunoId;

}
