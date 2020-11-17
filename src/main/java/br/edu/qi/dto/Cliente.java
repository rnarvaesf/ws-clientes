package br.edu.qi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @Column(nullable = false,length = 150)
    private  String nome;
    @Column(nullable = false,length = 11)
    private String cpf;
    @Column
    private LocalDate data;

    @PrePersist
    public  void prePersist()
    {
        setData(LocalDate.now());
    }

}