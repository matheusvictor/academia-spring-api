package dio.academia.spring.api.entity.form;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

    @NotEmpty(message = "Preencha o campo corretamente!")
    @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String nome;

    @NotEmpty(message = "Preencha o campo corretamente!")
    @CPF(message = "'${validatedValue}' não é válido!")
    private String cpf;

    @NotEmpty(message = "Preencha o campo corretamente!")
    @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String bairro;

    @NotNull(message = "Preencha o campo corretamente!")
    @Past(message = "Data '${valitatedValue}' é inválida!")
    private LocalDate dataDeNascimento;
}
