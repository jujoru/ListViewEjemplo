package es.jujoru.listviewejemplo;

/**
 * Created by NINO on 01/01/2018.
 */

public class Equipo {

    String nombre;
    String estadio;
    String logo;

    public Equipo(String nombre, String estadio, String logo) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.logo = logo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
