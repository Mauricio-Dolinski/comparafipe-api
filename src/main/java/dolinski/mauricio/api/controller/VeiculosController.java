package dolinski.mauricio.api.controller;

import org.jboss.resteasy.reactive.RestResponse;

import dolinski.mauricio.api.dto.VeiculoCompararDTO;
import dolinski.mauricio.api.service.FipeService;
import dolinski.mauricio.api.service.VeiculoService;
import jakarta.validation.Valid;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/veiculos")
public class VeiculosController {
    String path = "";
    FipeService fipeService = new FipeService();

    @GET
    public String getNome() {
        return """
                {"carros", "motos", "caminhoes"}
                """;
    }

    @Path("/{tipoVeiculo}/marcas")
    @GET
    public RestResponse<String> getMarcas(@PathParam("tipoVeiculo") String tipoVeiculo) {
        path = "/" + tipoVeiculo + "/marcas";
        return fipeService.obterDados(path);
    }

    @Path("/{tipoVeiculo}/marcas/{marcaId}/modelos")
    @GET
    public RestResponse<String> getModelos(@PathParam("tipoVeiculo") String tipoVeiculo, @PathParam("marcaId") int marcaId) {
        path = "/" + tipoVeiculo + "/marcas/" + marcaId + "/modelos";
        return fipeService.obterDados(path);
    }

    @Path("/{tipoVeiculo}/marcas/{marcaId}/modelos/{modeloId}/anos")
    @GET
    public RestResponse<String> getAnos(@PathParam("tipoVeiculo") String tipoVeiculo, @PathParam("marcaId") int marcaId, @PathParam("modeloId") int modeloId) {
        path = "/" + tipoVeiculo + "/marcas/" + marcaId + "/modelos/" + modeloId + "/anos";
        return fipeService.obterDados(path);
    }

    @Path("/{tipoVeiculo}/marcas/{marcaId}/modelos/{modeloId}/anos/{ano}")
    @GET
    public RestResponse<String> getVeiculo(@PathParam("tipoVeiculo") String tipoVeiculo, @PathParam("marcaId") int marcaId, @PathParam("modeloId") int modeloId, @PathParam("ano") String ano) {
        path = "/" + tipoVeiculo + "/marcas/" + marcaId + "/modelos/" + modeloId + "/anos/" + ano;
        return fipeService.obterDados(path);
    }

    @Path("/comparar")
    @POST
    public RestResponse<String> validar(@Valid @BeanParam VeiculoCompararDTO dto) {
        VeiculoService service = new VeiculoService();
        return service.comparar(dto);
    }
}
