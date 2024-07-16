package dolinski.mauricio.api.service;

import org.jboss.resteasy.reactive.RestResponse;
import dolinski.mauricio.api.dto.VeiculoCompararDTO;
import org.jboss.resteasy.reactive.RestResponse.ResponseBuilder;

public class VeiculoService {

    public RestResponse<String> comparar(VeiculoCompararDTO dto) {
        String response = "" +  dto.toString();
        String path = "/" + dto.getTipoVeiculo() + 
                "/marcas/" + dto.getMarca() + 
                "/modelos/" + dto.getModelo() + 
                "/anos/" + dto.getAno();
        
        return ResponseBuilder.ok(response).build();
    }
}
