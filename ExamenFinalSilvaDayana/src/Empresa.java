import Servicios.Servicio;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Servicio> servicios = new ArrayList();
    private String razonSocial;



    public void agregarServicio(Servicio servicio){
        this.servicios.add(servicio);
    }
    public void quitarServicio(Servicio servicio){
        this.servicios.remove(servicio);
    }
    public void mostrarServicios(){
        for (Servicio servicio: this.servicios){
        }
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
