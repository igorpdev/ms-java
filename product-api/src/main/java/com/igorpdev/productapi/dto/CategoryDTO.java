package com.igorpdev.productapi.dto;

import javax.validation.constraints.NotNull;

import com.igorpdev.productapi.model.Category;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDTO {

    @NotNull
    private Long id;

    private String nome;

    public static CategoryDTO convert(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setNome(category.getNome());
        return categoryDTO;
    }

}