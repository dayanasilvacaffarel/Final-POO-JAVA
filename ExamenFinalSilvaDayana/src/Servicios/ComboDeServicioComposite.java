package Servicios;

import java.util.ArrayList;

public class ComboDeServicioComposite extends Servicio{

    private ArrayList<Servicio> servicios = new ArrayList();
    private double descuento;


    @Override
    public double calcularPrecio() {
        double monto =0.0;
        for (Servicio servicio : this.servicios){
            monto =+ servicio.calcularPrecio();
        }
        return monto * (1-this.descuento);
    }

    public void agregarServicio(Servicio servicio){
        this.servicios.add(servicio);
    }
    public void quitarServicio(Servicio servicio){
        this.servicios.remove(servicio);
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
