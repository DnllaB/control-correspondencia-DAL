package com.dal.demo.domain.entity;


import jakarta.persistence.*;
import lombok.*;

// Anotaciones de Lombok para reducir el boilerplate (código repetitivo)
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity // Indica que esta clase es una entidad JPA


public class Rol {

    @Id // Marca el campo como la clave primaria
    @SequenceGenerator(
            name = "rol_id_sequence",
            sequenceName = "rol_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "rol_id_sequence"
    )
    private Integer id_rol;
    private String name_rol;
}
