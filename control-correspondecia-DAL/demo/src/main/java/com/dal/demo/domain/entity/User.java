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



public class User {

    @Id // Marca el campo como la clave primaria
    @SequenceGenerator(
            name = "user_id_sequence",
            sequenceName = "user_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_id_sequence"
    )
    private Integer id_user;
    private Integer id_area;
    private Integer dni_user;
    private String name_user;
    private String lstname_user;
    private String eml_user;
    private String password;

}
