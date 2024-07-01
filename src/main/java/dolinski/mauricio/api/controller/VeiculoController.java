package dolinski.mauricio.api.controller;

import org.jboss.resteasy.reactive.RestResponse;

import dolinski.mauricio.api.dto.VeiculoCompararDTO;
import dolinski.mauricio.api.service.VeiculoService;
import jakarta.validation.Valid;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/veiculo")
public class VeiculoController {

    VeiculoService service = new VeiculoService();
    
    @Path("/comparar")
    @POST
    public RestResponse<String> validar(@Valid @BeanParam VeiculoCompararDTO dto) {
        return service.comparar(dto);
    }
}
