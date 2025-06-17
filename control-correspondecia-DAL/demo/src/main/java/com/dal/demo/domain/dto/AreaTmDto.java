package com.dal.demo.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AreaTmDto {

     Integer id_area;
     String name_area;
     String detail_area;
}
