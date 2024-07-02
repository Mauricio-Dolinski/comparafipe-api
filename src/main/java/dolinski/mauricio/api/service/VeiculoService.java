package dolinski.mauricio.api.service;

import org.jboss.resteasy.reactive.RestResponse;
import dolinski.mauricio.api.dto.VeiculoCompararDTO;
import org.jboss.resteasy.reactive.RestResponse.ResponseBuilder;

public class VeiculoService {

    public RestResponse<String> comparar(VeiculoCompararDTO dto) {
        String response = "" +  dto.toString();
        return ResponseBuilder.ok(response).build();
    }
}
