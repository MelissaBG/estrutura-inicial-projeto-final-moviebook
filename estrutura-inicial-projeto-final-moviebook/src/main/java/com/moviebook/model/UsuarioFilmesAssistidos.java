package com.moviebook.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioFilmesAssistidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_assistidos;
    private Long id_usuario;
    private List <Filmes> filmesAssistidos;
}
