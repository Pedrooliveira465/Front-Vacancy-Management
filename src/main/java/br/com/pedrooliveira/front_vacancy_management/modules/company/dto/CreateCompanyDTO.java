package br.com.pedrooliveira.front_vacancy_management.modules.company.dto;

import lombok.Data;

@Data
public class CreateCompanyDTO {

    private String username;
    private String email;
    private String website;
    private String description;
    private String name;
    private String password;
}
