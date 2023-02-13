package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Direccion {

    @Column
    private String direccion;

    @Column
    private String ciudad;

    @Column
    private String provincia;

    @Column
    private int codigoPostal;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Direccion{" + "direccion=" + direccion + ", ciudad=" + ciudad + ", provincia=" + provincia + ", codigoPostal=" + codigoPostal + '}';
    }

    public Direccion(String direccion, String ciudad, String provincia, int codigoPostal) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
    }

    public Direccion() {

    }
}


