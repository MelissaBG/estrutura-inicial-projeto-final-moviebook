package com.moviebook.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioWatchList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuarioWatchList;
    private Long id_usuario;
    private Long id_filme;
}
