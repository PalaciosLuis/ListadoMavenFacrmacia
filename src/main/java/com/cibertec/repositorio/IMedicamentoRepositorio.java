package com.cibertec.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.modelo.Medicamento;

public interface IMedicamentoRepositorio extends JpaRepository<Medicamento, Integer>{

}
