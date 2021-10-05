package cl.salcobrand.archivo.sura.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArchivoSBModel {

	private Date fechaRegistro;
	private int ctNumeroContrato;
	private int codigoAutorizacion;
	private int folioCliente;
	private int descBonificacion;
	private int montoBonificado;
	private int montoDeducible;
	private int montoTransaccion;
	private String poliza;
	private int grupoEmpresa;
}
