package com.github.gabguedes.ms_cep.controller;

import com.github.gabguedes.ms_cep.dto.EnderecoDTO;
import com.github.gabguedes.ms_cep.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class EnderecoController {

    @Autowired
    EnderecoService service;

    @GetMapping("/cep/{cep}")
    public ResponseEntity<EnderecoDTO> findByCep(@PathVariable String cep){
        EnderecoDTO dto = service.getCep(cep);
        return ResponseEntity.ok(dto);
    }

}
