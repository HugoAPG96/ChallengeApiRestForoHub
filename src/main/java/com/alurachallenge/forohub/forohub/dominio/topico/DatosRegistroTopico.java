package com.alurachallenge.forohub.forohub.dominio.topico;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(
        @NotBlank(message = "Campo titulo obligatorio")
        String titulo,
        @NotBlank(message = "Campo mensaje obligatorio")
        String mensaje,
        @NotBlank(message = "Campo autor obligatorio")
        String autor,
        @NotBlank(message = "Campo curso obligatorio")
        String curso
) {
}
