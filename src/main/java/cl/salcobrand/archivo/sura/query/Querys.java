package cl.salcobrand.archivo.sura.query;

public class Querys {

	private Querys() {
		throw new IllegalStateException("Querys class");
	}
	
	public static final String SELECT_ARCHIVO_SURA = "SELECT MAX(a.fecha_registro),\r\n"
			+ "                    a.ct_numero_contrato,\r\n"
			+ "                    a.codigo_autorizacion,\r\n"
			+ "                    i.folio_cliente,\r\n"
			+ "                    c.desc_bonificacion,\r\n"
			+ "                    a.monto_bonificado,\r\n"
			+ "                    a.monto_deducible,\r\n"
			+ "                    a.monto_transaccion,\r\n"
			+ "                    NVL (g.atributo2, 0),\r\n"
			+ "                    c.ge_codigo\r\n"
			+ "             FROM   phb.detalle_consumos a,\r\n"
			+ "                    phb.productos b,\r\n"
			+ "                    phb.contratos c,\r\n"
			+ "                    phb.beneficiarios g,\r\n"
			+ "                    phb.prefactura_cliente i,\r\n"
			+ "                    phb.contratos_phb_syb j\r\n"
			+ "            WHERE   a.ef_codigo = 1\r\n"
			+ "                    AND a.fecha_registro BETWEEN '01-may-21' AND '31-may-21'\r\n"
			+ "                    AND a.parametro_aplicacion IS NOT NULL\r\n"
			+ "                    AND a.estado_consumo IN ('1', '2')\r\n"
			+ "                    AND a.monto_bonificado + a.monto_deducible > 0\r\n"
			+ "                    AND a.ct_numero_contrato in (8243, 8358)\r\n"
			+ "                    AND b.inventory_item_id = a.inventory_item_id\r\n"
			+ "                    AND c.ef_codigo = a.ef_codigo\r\n"
			+ "                    AND c.numero_contrato = a.ct_numero_contrato\r\n"
			+ "                    AND c.ind_webservices = 'WS21'\r\n"
			+ "                    AND a.resultado_consumo IN ('00', '93')\r\n"
			+ "                    AND g.ef_codigo = a.ef_codigo\r\n"
			+ "                    AND g.ct_numero_contrato = a.ct_numero_contrato\r\n"
			+ "                    AND g.rut_titular = a.rut_titular\r\n"
			+ "                    AND g.pt_party_id = a.pt_party_id\r\n"
			+ "                    AND i.codigo_autorizacion = a.codigo_autorizacion\r\n"
			+ "                    AND i.ct_numero_contrato = a.ct_numero_contrato\r\n"
			+ "                    AND j.ct_contrato_syb =130006184\r\n"
			+ "            GROUP BY a.ct_numero_contrato, a.codigo_autorizacion, \r\n"
			+ "            i.folio_cliente, c.desc_bonificacion, \r\n"
			+ "            a.monto_bonificado, a.monto_deducible, \r\n"
			+ "            a.monto_transaccion,c.ge_codigo, \r\n"
			+ "            g.atributo2\r\n"
			+ "            ORDER BY a.codigo_autorizacion asc";

}
