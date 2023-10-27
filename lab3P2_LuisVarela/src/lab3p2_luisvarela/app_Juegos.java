/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_luisvarela;

/**
 *
 * @author Luis Andres Varela
 */
public class app_Juegos extends Aplicacion {

    private int Edad_Recomendada;

    @Override
    public String toString() {
        return super.toString() + "\nEdad Recomendada:" + Edad_Recomendada;
    }

    public app_Juegos(int Edad_Recomendada, String nombre, String desarrollador, int precio) {
        super(nombre, desarrollador, precio);
        this.Edad_Recomendada = Edad_Recomendada;
    }

    public int getEdad_Recomendada() {
        return Edad_Recomendada;
    }

    public void setEdad_Recomendada(int Edad_Recomendada) {
        this.Edad_Recomendada = Edad_Recomendada;
    }

}
