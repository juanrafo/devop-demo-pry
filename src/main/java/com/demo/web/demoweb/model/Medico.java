package com.demo.web.demoweb.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Data
public class Medico {
    private Integer id;
    private String codigo;
    private String nombre;
    private String apellido;
}
