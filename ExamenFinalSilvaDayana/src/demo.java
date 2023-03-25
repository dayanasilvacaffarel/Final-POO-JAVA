import Servicios.ComboDeServicioComposite;
import Servicios.ServicioSimple;
import Servicios.Servicio;

public class demo {
    public static void main(String[] args) {

        ServicioFactorymethodSingleton fabrica = ServicioFactorymethodSingleton.obtenerInstancia();
        Empresa empresa = new Empresa();

        System.out.println("\n Venta Aire Acondicionado");
        ServicioSimple aireAcondicionado = (ServicioSimple) fabrica.crearServicio("SIMPLE");
        aireAcondicionado.setNombre("Venta Aire Acondicionado");
        aireAcondicionado.setPrecioBase(65000);
        aireAcondicionado.setIncluyeColocacion(false);

        System.out.println("\n Colocación Aire Acondicionado");
        ServicioSimple colocacionAire = (ServicioSimple) fabrica.crearServicio("SIMPLE");
        colocacionAire.setNombre("Colocacion Aire Acondicionado");
        colocacionAire.setPrecioBase(10000);
        colocacionAire.setIncluyeColocacion(true);
        

        System.out.println("\n Full Aire Acondicionado");
        ComboDeServicioComposite fullAire = (ComboDeServicioComposite) fabrica.crearServicio("COMBO");
        fullAire.setNombre("Full Aire Acondicionado");
        fullAire.agregarServicio(aireAcondicionado);
        fullAire.agregarServicio(colocacionAire);
        fullAire.setDescuento(10);

        empresa.agregarServicio(aireAcondicionado);
        empresa.agregarServicio(colocacionAire);
        empresa.agregarServicio(fullAire);

        System.out.println();
    }
}
