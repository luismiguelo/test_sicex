package cl.losheroes.cargasfamiliares.procesadores;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import cl.losheroes.cargasfamiliares.dto.CargasFamiliaresTrabajador;
import cl.losheroes.cargasfamiliares.vo.ResponseSuccess;

public class ProcesadorCargasFamiliares implements Processor {
	
	@Override
	public void process(Exchange exchange) throws Exception {
		
		List<CargasFamiliaresTrabajador> cargasFamiliares = (List<CargasFamiliaresTrabajador>) exchange.getIn().getBody();
		
		if (cargasFamiliares.size() > 0 ) {
			ResponseSuccess responseSuccess = new ResponseSuccess();
			responseSuccess.setPath("/v1/sucursal-virtual/compensaciones/cargas-familiares/ws018");
			responseSuccess.setCargasFamiliares(cargasFamiliares);
			exchange.getOut().setBody(responseSuccess);
		} else {
			ResponseSuccess responseSuccess = new ResponseSuccess();
			responseSuccess.setPath("/v1/sucursal-virtual/compensaciones/cargas-familiares/ws018");
			responseSuccess.setCargasFamiliares(null);
			exchange.getOut().setBody(responseSuccess);
		}
	}
}
