package cl.salcobrand.archivo.sura.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.salcobrand.archivo.sura.response.ListArchivoSBResponse;
import cl.salcobrand.archivo.sura.service.IArchivoService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MicroServiceArchivoController {
	
	@Autowired(required=true)
	IArchivoService service;
	
	@GetMapping(value = "/jsonsura")
	public ListArchivoSBResponse methodGet() {
		log.info("Controller::methodGet");
		return service.serviceMethodGet();
	}

}
