public class ObjVersionArchivo {
    int NumVersion;  
    String NombreArchivo;  
    String Fecha;
    String Descripcion;
    
    public ObjVersionArchivo(int numVersion, String nombreArchivo, String fecha, String descripcion) {
        NumVersion = numVersion;
        NombreArchivo = nombreArchivo;
        Fecha = fecha;
        Descripcion = descripcion;
    }

    public int getNumVersion() {
        return NumVersion;
    }

    public void setNumVersion(int numVersion) {
        NumVersion = numVersion;
    }

    public String getNombreArchivo() {
        return NombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        NombreArchivo = nombreArchivo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    
}