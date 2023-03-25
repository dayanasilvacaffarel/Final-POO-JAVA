package Servicios;

public class ServicioSimple extends Servicio{

    public double precioBase;
    public boolean incluyeColocacion;


    @Override
    public double calcularPrecio() {
        if (this.incluyeColocacion == true){
            return this.precioBase *1.1;
        }
        return this.precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean IncluyeColocacion() {
        return incluyeColocacion;
    }

    public void setIncluyeColocacion(boolean incluyeColocacion) {
        this.incluyeColocacion = incluyeColocacion;
    }
}
