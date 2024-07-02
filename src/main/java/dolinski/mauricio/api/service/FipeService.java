package dolinski.mauricio.api.service;

import org.jboss.resteasy.reactive.RestResponse;
import org.jboss.resteasy.reactive.RestResponse.ResponseBuilder;

import jakarta.ws.rs.Path;

public class FipeService {
    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1";

    public FipeService () {

    }

    public RestResponse<String> obterDados (String endereco) {
        ConsumoAPI consumoAPI = new ConsumoAPI();
        try {
            return ResponseBuilder.ok(consumoAPI.obterDados(URL_BASE + endereco)).build();
        } catch (Exception e) {
            return ResponseBuilder.create(RestResponse.Status.BAD_REQUEST, e.getMessage()).build();
        }
    }
}
