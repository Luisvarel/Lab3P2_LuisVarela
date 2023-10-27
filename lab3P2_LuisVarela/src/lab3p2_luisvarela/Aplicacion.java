package lab3p2_luisvarela;

public class Aplicacion {

    protected String nombre = "";

    protected String desarrollador = "";

    protected int precio;

    protected boolean estado;

    protected int rating;

    protected int cantidad_descarga;

    @Override
    public String toString() {
        String estado1 = "";
        if (estado) {
            estado1 = "Descargado";
        } else {
            estado1 = "No descargado";
        }
        return "Nombre de la aplicacion:" + nombre + "\nDesarrollador:" + desarrollador + "\nPrecio:" + precio + "\nEstado:" + estado1 + "\nRating:" + rating + "\nCantidad de descargas:" + cantidad_descarga;
    }

    public Aplicacion(String nombre, String desarrollador, int precio) {
        this.nombre = nombre;
        this.desarrollador = desarrollador;
        this.precio = precio;
        this.estado = false;
        this.rating = 0;
        this.cantidad_descarga = 0;
    }

    public Aplicacion() {

    }

    public int getCantidad_descarga() {
        return cantidad_descarga;
    }

    public void setCantidad_descarga(int cantidad_descarga) {
        this.cantidad_descarga = cantidad_descarga;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        if (desarrollador.length() != 0) {
            this.desarrollador = desarrollador;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() != 0) {
            this.nombre = nombre;
        }

    }

}
