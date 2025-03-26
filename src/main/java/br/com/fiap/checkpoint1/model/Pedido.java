package br.com.fiap.checkpoint1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "O nome do cliente é obrigatório")
    private String clienteNome;
    
    private LocalDate dataPedido = LocalDate.now();
    
    @NotNull
    @Positive(message = "O valor total deve ser positivo")
    private Double valorTotal;
} 