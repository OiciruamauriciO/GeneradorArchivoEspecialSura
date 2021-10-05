package cl.salcobrand.archivo.sura.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.salcobrand.archivo.sura.model.ArchivoSBModel;

public class ArchivoSBRowMapper implements RowMapper<ArchivoSBModel>{

	@Override
	public ArchivoSBModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ArchivoSBModel entity = new ArchivoSBModel();
		
		entity.setFechaRegistro(rs.getDate("MAX(a.fecha_registro)"));
		entity.setCtNumeroContrato(rs.getInt("ct_numero_contrato"));
		entity.setCodigoAutorizacion(rs.getInt("codigo_autorizacion"));
		entity.setFolioCliente(rs.getInt("folio_cliente"));
		entity.setDescBonificacion(rs.getInt("desc_bonificacion"));
		entity.setMontoBonificado(rs.getInt("monto_bonificado"));
		entity.setMontoDeducible(rs.getInt("monto_deducible"));
		entity.setMontoTransaccion(rs.getInt("monto_transaccion"));
		entity.setPoliza(rs.getString("NVL(g.atributo2,0)"));
		entity.setGrupoEmpresa(rs.getInt("ge_codigo"));
		
		return entity;
	}

}
