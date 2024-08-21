package com.github.gabguedes.ms_cep.dto;

import com.github.gabguedes.ms_cep.model.Endereco;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDTO {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public EnderecoDTO(Endereco entity) {
        this.cep = entity.getCep();
        this.logradouro = entity.getLogradouro();
        this.complemento = entity.getComplemento();
        this.bairro = entity.getBairro();
        this.localidade = entity.getLocalidade();
        this.uf = entity.getUf();
    }
}
