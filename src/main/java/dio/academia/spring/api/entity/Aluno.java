package dio.academia.spring.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data // abstração para getters, setters, hashcode, etc.
@NoArgsConstructor // construtor padrão
@AllArgsConstructor // constutor sobrecarregador
@Entity
@Table(name = "tb_alunos")
@JsonIgnoreProperties({"hibernateLazyInitialyzer", "handler"})
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String cpf;

    private String bairro;

    private LocalDate dataDeNascimento;

    @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY) // anotação para relacionamento, cardinalidade
    @JsonIgnore
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}
