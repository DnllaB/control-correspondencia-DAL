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

public class AreaCategoryRqst {

    @Id // Marca el campo como la clave primaria
    @SequenceGenerator(
            name = "id_ctgryrqst_id_sequence",
            sequenceName = "id_ctgryrqst_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "id_ctgryrqst_id_sequence"
    )

    private Integer id_ctgryrqst;
    private Integer id_area;

}
