package cl.salcobrand.archivo.sura.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import cl.salcobrand.archivo.sura.model.ArchivoSBModel;
import cl.salcobrand.archivo.sura.repository.IArchivoRepository;
import cl.salcobrand.archivo.sura.response.ArchivoSBResponse;
import cl.salcobrand.archivo.sura.response.ListArchivoSBResponse;
import cl.salcobrand.archivo.sura.service.IArchivoService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ArchivoServiceImpl implements IArchivoService{
	
	@Autowired(required=true)
	IArchivoRepository repository;
	
	@Override
	public ListArchivoSBResponse serviceMethodGet() {
		log.info("Service:Impl::serviceMethodGet");
		
		ListArchivoSBResponse response = null;
		List<ArchivoSBResponse> list = new ArrayList<>();
		List<ArchivoSBModel> archivo = null;
		
		try {
			
			archivo = repository.repositoryGetData();
			
			if(archivo!=null) {
				
				for(ArchivoSBModel asm: archivo) {
					ArchivoSBResponse archivoResponse = new ArchivoSBResponse(asm.getFechaRegistro(), asm.getCtNumeroContrato(), asm.getCodigoAutorizacion(), asm.getFolioCliente(), asm.getDescBonificacion(), asm.getMontoBonificado(), asm.getMontoDeducible(),asm.getMontoTransaccion(), asm.getPoliza(), asm.getGrupoEmpresa());
					list.add(archivoResponse);
				}
				
				response = new ListArchivoSBResponse(list);
				response.setStatus(200);
				response.setMessage("OK");
				
			}else {
				response = new ListArchivoSBResponse(list);
				response.setStatus(500);
				response.setMessage("Error al obtener lista, lista es null");
				
				log.error("Error al obtener lista, lista es null - Revisar Logs");				
			}
			
		}catch(Exception e) {
			response = new ListArchivoSBResponse(list);
			response.setStatus(500);
			response.setMessage("Error al obtener lista - excepción producida en el servicio - Revisar Logs");			
		}finally {
			Gson gson = new Gson();			
			log.info("response {}", gson.toJson(response));
		}
		
		return response;

	}
}
