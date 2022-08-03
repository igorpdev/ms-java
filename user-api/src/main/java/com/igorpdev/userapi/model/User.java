package com.igorpdev.userapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.igorpdev.userapi.dto.UserDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "user")
public class User {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String nome;

	private String cpf;

	private String endereco;

    private String email;

    private String telefone;

    private Date dataCadastro;

    public static User convert(UserDTO userDTO) {
		User user = new User();
		user.setNome(userDTO.getNome());
		user.setEndereco(userDTO.getEndereco());
		user.setCpf(userDTO.getCpf());
        user.setEmail(userDTO.getEmail());
        user.setTelefone(userDTO.getTelefone());
        user.setDataCadastro(userDTO.getDataCadastro());
		
		return user;
	}

}
