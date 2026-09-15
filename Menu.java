import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<ObjVersionArchivo> pila = new Stack<>();
        Metodos m = new Metodos();
        Validaciones v = new Validaciones();

        boolean continuar=true;
        while (continuar) {
            System.out.println("Bienvenido al versionador de archivos");
            System.out.println("Que desea realizar?");
            System.out.println("1) Crear una nueva versión");
            System.out.println("2) Volver a la versión anterior");
            System.out.println("3) Consultar la versión actual");
            System.out.println("4) Mostrar todas las versiones disponibles.");
            System.out.println("5) Para salir");
            int opt = v.ValidarEntero(sc);
            System.out.println();
            switch (opt) {
                case 1:
                    pila=m.CrearNuevaVersion(pila, sc, v);
                    break;
                case 2:
                    pila= m.VolverVersionAnterior(pila);
                    break;
                case 3:
                    m.MostrarVersionActual(pila);
                    break;
                case 4:
                    m.MostrarHistorial(pila);
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestros servicio");
                    continuar=false;
                    break;
                default:
                    System.out.println("La opcion elegida no existe");
                    break;
            }
        }
    }
}
