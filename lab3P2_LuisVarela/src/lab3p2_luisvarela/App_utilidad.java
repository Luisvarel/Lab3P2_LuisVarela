/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_luisvarela;

/**
 *
 * @author Luis Andres Varela
 */
public class App_utilidad extends Aplicacion {

    private String categoría;

    public String getCategoría() {
        return categoría;
    }

    public App_utilidad(String categoría, String nombre, String desarrollador, int precio) {
        super(nombre, desarrollador, precio);
        this.categoría = categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCategoria:"+categoría;
    }

}
