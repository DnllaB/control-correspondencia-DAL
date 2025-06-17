package com.dal.demo.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record UserDto(

        Integer id_user,
        Integer id_area,
        Integer dni_user,
        String name_user,
        String lstname_user,
        String eml_user,
        String password

){

}

