package cl.salcobrand.archivo.sura.response;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ArchivoSBResponse {
	
	@JsonProperty("fechaRegistro")
	private Date fechaRegistro;
	
	@JsonProperty("ctNumeroContrato")
	private int ctNumeroContrato;
	
	@JsonProperty("codigoAutorizacion")
	private int codigoAutorizacion;
	
	@JsonProperty("folioCliente")
	private int folioCliente;
	
	@JsonProperty("descBonificacion")
	private int descBonificacion;
	
	@JsonProperty("montoBonificado")
	private int montoBonificado;
	
	@JsonProperty("montoDeducible")
	private int montoDeducible;
	
	@JsonProperty("montoTransaccion")	
	private int montoTransaccion;
	
	@JsonProperty("poliza")
	private String poliza;
	
	@JsonProperty("grupoEmpresa")
	private int grupoEmpresa;
}
