package cl.losheroes.cargasfamiliares.vo;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class ResponseSuccess {
	
	private List<?> cargasFamiliares;
	private String path;
	
	public String getStatus() {
		return "OK";
	}
	
	public String getTimestamp() {		
		LocalDateTime now = LocalDateTime.now();
		Timestamp timestampT = Timestamp.valueOf(now);
		return timestampT.toString();
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public List<?> getCargasFamiliares() {
		return cargasFamiliares;
	}
	
	public void setCargasFamiliares(List<?> cargasFamiliares) {
		this.cargasFamiliares = cargasFamiliares;
	}

}
