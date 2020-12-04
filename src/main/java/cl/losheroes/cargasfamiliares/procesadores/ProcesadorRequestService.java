package cl.losheroes.cargasfamiliares.procesadores;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

import cl.losheroes.cargasfamiliares.vo.RequestService;

public class ProcesadorRequestService implements Processor {
	
	private static final Logger logger = Logger.getLogger(ProcesadorRequestService.class);
	
	@Override
	public void process(Exchange exchange) {
		
		logger.info("exchange : "+exchange.getIn().getBody(String.class));
//		logger.info("exchange : "+exchange.getIn().getBody(RequestService.class));
		
//		RequestService requestService =  exchange.getIn().getBody(String.class);
		
//		logger.info("Objeto : "+requestService);
//		logger.info("RutEmpresa : "+requestService.getRutEmpresa());
//		logger.info("Objeto : "+requestService.toString());
	}
}
