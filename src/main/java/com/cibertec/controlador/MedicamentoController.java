package com.cibertec.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.cibertec.modelo.Medicamento;
import com.cibertec.repositorio.IMedicamentoRepositorio;

@Controller
@RequestMapping("/medicamentos")
public class MedicamentoController {
	
	@Autowired
	private IMedicamentoRepositorio medicamentoRepositorio;
	
	@GetMapping("/")
	public String listarMedicamentos(Model model) {
		List<Medicamento> medicamentos = medicamentoRepositorio.findAll();
		model.addAttribute("medicamentos", medicamentos);
		return "listarMedicamentos"; // nombre de la vista
	}

}
