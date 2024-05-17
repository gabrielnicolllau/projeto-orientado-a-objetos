package br.senac.sp.cadastroDeCelular;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Celular {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    
    // Nomes dos campos do BD
    private Long id;
    private int quantidade;
    private double preco;
    private String descricao;
    private String modelo;
    private String marca;







}
