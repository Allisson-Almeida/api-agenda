package br.com.cotiinformatica.api_agenda.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "categorias")
@Data
public class Categoria {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // ID vai ser gerado automaticamente no BD
    @Column(name = "id")
    private UUID id;

    @Column(name = "nome",length = 25, nullable = false, unique = true)
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private List<Compromisso> compromisso;
}

