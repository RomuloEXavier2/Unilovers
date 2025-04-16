package com.unilovers.logitrack.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntregaSimulada {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String origem;
    private String destino;
    private String prioridade;
    private String status;
    private Long roboResponsavelId;
}
