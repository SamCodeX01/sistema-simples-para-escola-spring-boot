package sistema.escola.br.com.Sistema.para.Escola.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data //Aqui já esta tratando o Getters e Setters
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


    public Aluno(int RA, String nome, int idade, float altura, String curso) {
        this.RA = RA;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.curso = curso;
    }

    public Aluno() {
    }
}

