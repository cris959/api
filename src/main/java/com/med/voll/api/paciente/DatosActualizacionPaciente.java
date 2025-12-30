package com.med.voll.api.paciente;

import com.med.voll.api.direccion.DatosDireccion;
import jakarta.validation.constraints.NotNull;

public record DatosActualizacionPaciente (
        @NotNull Long id,
        Boolean activo,
        String nombre,
        String telefono,
        DatosDireccion direccion
){
}
