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
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL) // as alterações nas avaliações refletirá no aluno
    @JoinColumn(name = "aluno_id") // a coluna das FKs estará na tabela de avaliações físicas
    private Aluno aluno;

    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

    @Column(name = "peso_atual")
    private double peso;

    @Column(name = "atura_atual")
    private double altura;

}
