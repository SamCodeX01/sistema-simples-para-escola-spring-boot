package sistema.escola.br.com.Sistema.para.Escola.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table //Identifica que essa classe é uma tabela
@Entity //Identifica que essa classe é uma entidade
public class Aluno {
    @Column // Identifica que o campo abaixo é uma coluna
    @Id //Identifica que um atributo é chave primária em JPA
        private int RA;
    @Column
        private String nome;
    @Column
        private int idade;
    @Column
        private  float altura;
    @Column
        private String curso;
}
