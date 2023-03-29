package dio.academia.spring.api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data // abstração para getters, setters, hashcode, etc.
@NoArgsConstructor // construtor padrão
@AllArgsConstructor // constutor sobrecarregador
@Entity
@Table(name = "tb_matriculas")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL) // se uma matrícula for excluída, o aluno tbm será
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    private LocalDateTime dataDaMatricula = LocalDateTime.now();
}
