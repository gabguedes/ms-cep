package com.github.gabguedes.ms_cep.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String localidade;
    private String uf;
    private Long ibge;
    private Long gia;
    private int ddd;
    private Long siafi;


}
