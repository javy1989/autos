package ec.ricardo.com.ventaautos.model;

import java.io.Serializable;
import java.util.Date;

public class Vehiculo implements Serializable{
    private int img;
    private Integer identificador;
    private String placa;
    private String marca;
    private String color;
    private Date fecha;
    private Boolean estado;

    public Vehiculo() {
    }

    public Vehiculo(int img,Integer identificador, String placa, String marca, String color, Date fecha, Boolean estado) {
        this.img=img;
        this.identificador = identificador;
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
