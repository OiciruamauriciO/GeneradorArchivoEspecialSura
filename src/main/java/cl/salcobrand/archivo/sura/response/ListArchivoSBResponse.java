package cl.salcobrand.archivo.sura.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ListArchivoSBResponse extends GenericResponse{
	
	@JsonProperty("list_archivo_sb")
	private List<ArchivoSBResponse> list;
}
