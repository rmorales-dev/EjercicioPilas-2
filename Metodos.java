import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    public Stack<ObjVersionArchivo> CrearNuevaVersion(Stack<ObjVersionArchivo> pila, Scanner sc, Validaciones v) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese la version del archivo: ");
            int numVersion = v.ValidarEntero(sc);
            System.out.println("Ingrese el nombre del archivo: ");
            String NombreArchivo = v.ValidarString(sc);
            System.out.println("Ingrese la fecha: ");
            String Fecha = v.ValidarString(sc);
            System.out.println("Ingrese la descripcion del archivo: ");
            String Descripcion = v.ValidarString(sc);

            ObjVersionArchivo o = new ObjVersionArchivo(numVersion, NombreArchivo, Fecha, Descripcion);
            pila.push(o);
            System.out.println("Ingrese 1) si quiere ingresar otra version 2) para salir");
            int opt = v.ValidarEntero(sc);
            if (opt == 2) {
                continuar = false;

            }
        }
        return pila;
    }

    public Stack<ObjVersionArchivo> VolverVersionAnterior(Stack<ObjVersionArchivo> pila) {
        if (!pila.empty()) {
            pila.pop();
            System.out.println("Se ha regresado a la version anterior");
        } else {
            System.out.println("No existe una version anterior");
            System.out.println();
        }
        return pila;
    }

    public void MostrarHistorial(Stack<ObjVersionArchivo> pila) {
        if (!pila.empty()) {
        for (ObjVersionArchivo o : pila) {
            System.out.println("Contamos con la version "+o.getNumVersion());
        }
    }else{
        System.out.println("No existe historial para mostrar ingrese la primera version");
        System.out.println();
    }
    }

    public void MostrarVersionActual(Stack<ObjVersionArchivo> pila) {
        if (!pila.empty()) {
            ObjVersionArchivo o = pila.peek();
            System.out.println("La version actual del archivo es la " + o.getNumVersion());

        } else {
            System.out.println("Actualmente no hay versiones disponibles");
            System.out.println();
        }
    }
}
