package com.github.gabguedes.ms_cep.dto;

import com.github.gabguedes.ms_cep.model.Endereco;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDTO {

    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String localidade;
    private String uf;

    public EnderecoDTO(Endereco entity) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.unidade = unidade;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }
}
