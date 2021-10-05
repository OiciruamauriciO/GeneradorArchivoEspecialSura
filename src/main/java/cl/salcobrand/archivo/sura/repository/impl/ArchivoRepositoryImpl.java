package cl.salcobrand.archivo.sura.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import cl.salcobrand.archivo.sura.model.ArchivoSBModel;
import cl.salcobrand.archivo.sura.query.Querys;
import cl.salcobrand.archivo.sura.repository.*;
import cl.salcobrand.archivo.sura.rowmapper.ArchivoSBRowMapper;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ArchivoRepositoryImpl implements IArchivoRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<ArchivoSBModel> repositoryGetData() {
		log.info("Repository:Impl::repositoryGetData");
		
		List<ArchivoSBModel> archivo = null;
		
		try {
			
			RowMapper<ArchivoSBModel> rm = new ArchivoSBRowMapper();
			archivo = jdbcTemplate.query(Querys.SELECT_ARCHIVO_SURA, rm);
			
		}catch (Exception e) {
			log.error("ERROR - DAO Exception {} ", e.getMessage());
		}
		
		
		return archivo;
	}

	
}
