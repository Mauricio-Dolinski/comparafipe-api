package dolinski.mauricio.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.ws.rs.FormParam;

public class VeiculoCompararDTO {
    @NotBlank(message = "Campo tipoVeiculo não pode ser vazio")
    @Pattern(regexp = "^(carros|motos|caminhoes)$", message = "Campo tipoVeiculo deve conter carros ou motos ou caminhoes")
    @FormParam("tipoVeiculo")
    String tipoVeiculo;

    @NotBlank(message = "Campo marca não pode ser vazio")
    @FormParam("marca")
    String marca;

    @NotBlank(message = "Campo modelo não pode ser vazio")
    @FormParam("modelo")
    String modelo;

    @NotNull(message = "Campo ano2 não pode ser nulo")
    @FormParam("ano")
    String ano;

    @NotBlank(message = "Campo tipoVeiculo2 não pode ser vazio")
    @Pattern(regexp = "^(carros|motos|caminhoes)$", message = "Campo tipoVeiculo2 deve conter carros ou motos ou caminhoes")
    @FormParam("tipoVeiculo2")
    String tipoVeiculo2;

    @NotBlank(message = "Campo marca2 não pode ser vazio")
    @FormParam("marca2")
    String marca2;

    @NotBlank(message = "Campo modelo2 não pode ser vazio")
    @FormParam("modelo2")
    String modelo2;

    @NotNull(message = "Campo ano2 não pode ser nulo")
    @FormParam("ano2")
    String ano2;

    //MesReferencia: "junho de 2024"


    public String getTipoVeiculo() {
        return this.tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getTipoVeiculo2() {
        return this.tipoVeiculo2;
    }

    public void setTipoVeiculo2(String tipoVeiculo2) {
        this.tipoVeiculo2 = tipoVeiculo2;
    }

    public String getMarca2() {
        return this.marca2;
    }

    public void setMarca2(String marca2) {
        this.marca2 = marca2;
    }

    public String getModelo2() {
        return this.modelo2;
    }

    public void setModelo2(String modelo2) {
        this.modelo2 = modelo2;
    }

    public String getAno2() {
        return this.ano2;
    }

    public void setAno2(String ano2) {
        this.ano2 = ano2;
    }

    public VeiculoCompararDTO() {};


    @Override
    public String toString() {
        return "{" +
            " tipoVeiculo='" + getTipoVeiculo() + "'" +
            ", marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", ano='" + getAno() + "'" +
            ", tipoVeiculo2='" + getTipoVeiculo2() + "'" +
            ", marca2='" + getMarca2() + "'" +
            ", modelo2='" + getModelo2() + "'" +
            ", ano2='" + getAno2() + "'" +
            "}";
    }

}
