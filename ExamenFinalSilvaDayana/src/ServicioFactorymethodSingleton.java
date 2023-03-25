import Servicios.ComboDeServicioComposite;
import Servicios.Servicio;
import Servicios.ServicioSimple;

public class ServicioFactorymethodSingleton {

    private static ServicioFactorymethodSingleton instancia;

    private ServicioFactorymethodSingleton() {
    }

    public static ServicioFactorymethodSingleton obtenerInstancia(){
        if (ServicioFactorymethodSingleton.instancia ==null){
            ServicioFactorymethodSingleton.instancia =new ServicioFactorymethodSingleton();
        }
        return ServicioFactorymethodSingleton.instancia;
    }

    public Servicio crearServicio(String tipo){
        switch (tipo.toUpperCase()){
            case "SIMPLE":
                return new ServicioSimple();
            case "COMBO":
                return new ComboDeServicioComposite();
        }
        return null;
    }
}
