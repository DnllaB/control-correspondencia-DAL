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

public class AreaTm {


    @Id // Marca el campo como la clave primaria
    @SequenceGenerator(
            name = "area_id_sequence",
            sequenceName = "area_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "area_id_sequence"
    )
    private Integer id_area;
    private String name_area;
    private String detail_area;

}
