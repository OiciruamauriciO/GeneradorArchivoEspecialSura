package cl.salcobrand.archivo.sura.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericResponse {
	
	@JsonProperty("status")
	private int status;
	
	@JsonProperty("message")
	private String message;

}
