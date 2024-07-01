package dolinski.mauricio.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Digits;
import jakarta.ws.rs.FormParam;

public class VeiculoCompararDTO {
    @NotBlank(message = "Campo veiculo não pode ser vazio")
    @FormParam("veiculo")
    String tipoVeiculo;

    @NotBlank(message = "Campo marca não pode ser vazio")
    @FormParam("marca")
    String marca;

    @NotBlank(message = "Campo modelo não pode ser vazio")
    @FormParam("modelo")
    String modelo;

    @NotNull(message = "Campo ano2 não pode ser nulo")
    @Digits(message = "Campo ano2 deve conter 4 numeros", fraction = 0, integer = 4)
    @Positive(message = "Numero deve ser positivo")
    @FormParam("ano")
    int ano;

    @NotBlank(message = "Campo veiculo2 não pode ser vazio")
    @FormParam("veiculo2")
    String tipoVeiculo2;

    @NotBlank(message = "Campo marca2 não pode ser vazio")
    @FormParam("marca2")
    String marca2;

    @NotBlank(message = "Campo modelo2 não pode ser vazio")
    @FormParam("modelo2")
    String modelo2;

    @NotNull(message = "Campo ano2 não pode ser nulo")
    @Digits(message = "Campo ano2 deve conter 4 numeros", fraction = 0, integer = 4)
    @Positive(message = "Numero deve ser positivo")
    @FormParam("ano2")
    int ano2;

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

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
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

    public int getAno2() {
        return this.ano2;
    }

    public void setAno2(int ano2) {
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
