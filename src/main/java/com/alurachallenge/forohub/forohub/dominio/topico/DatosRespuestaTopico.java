package com.alurachallenge.forohub.forohub.dominio.topico;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        String autor,
        String curso
) {
}
