package cl.losheroes.cargasfamiliares.vo;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class ResponseError {

	private int status;
	private String error;
	private String message;
	private String path;

	public String getTimestamp() {
		LocalDateTime now = LocalDateTime.now();
		Timestamp timestampT = Timestamp.valueOf(now);
		return timestampT.toString();
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
}
