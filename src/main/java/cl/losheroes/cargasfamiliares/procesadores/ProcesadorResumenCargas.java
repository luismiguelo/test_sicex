package cl.losheroes.cargasfamiliares.procesadores;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import cl.losheroes.cargasfamiliares.dto.ResumenCargasFamiliares;
import cl.losheroes.cargasfamiliares.vo.ResponseSuccess;

public class ProcesadorResumenCargas implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		List<ResumenCargasFamiliares> resumen =  exchange.getIn().getBody(ArrayList.class);
		
		if (resumen.size() > 0) {
			ResponseSuccess responseSuccess = new ResponseSuccess();
			responseSuccess.setPath("/v1/sucursal-virtual/compensaciones/cargas-familiares/ws017");
			responseSuccess.setCargasFamiliares(resumen);
			exchange.getOut().setBody(responseSuccess);
		} else {
			ResponseSuccess responseSuccess = new ResponseSuccess();
			responseSuccess.setPath("/v1/sucursal-virtual/compensaciones/cargas-familiares/ws017");
			responseSuccess.setCargasFamiliares(null);
			exchange.getOut().setBody(responseSuccess);
		}
	}
}
