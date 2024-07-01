package dolinski.mauricio.api.service;

import org.jboss.resteasy.reactive.RestResponse;

import dolinski.mauricio.api.dto.VeiculoCompararDTO;
import jakarta.validation.Valid;
import org.jboss.resteasy.reactive.RestResponse.ResponseBuilder;

public class VeiculoService {

    public RestResponse<String> comparar(@Valid VeiculoCompararDTO dto) {
        String response = "test";
        return ResponseBuilder.ok(response + " " + dto.toString()).build();
    }
}
