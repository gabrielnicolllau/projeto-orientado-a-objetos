package br.senac.sp.cadastroDeCelular;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Task {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    
    // Nomes dos campos do BD
    private Long id;
    private String titulo;
    private String descricao;
    private Integer score;
    private Integer status;    






}
