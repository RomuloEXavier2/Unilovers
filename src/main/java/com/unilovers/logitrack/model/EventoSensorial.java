package com.unilovers.logitrack.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventoSensorial {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo; // colisão, obstáculo, erro de rota
    private LocalDateTime timestamp;
    private Long roboId;
}
