package lab3p2_luisvarela;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_LuisVarela {

    public static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        boolean seguir = true;
        ArrayList<Aplicacion> a = new ArrayList();
        while (seguir) {
            System.out.println("1.Para el Administrador ");
            System.out.println("2.Para el Usuario ");
            System.out.println("3.Salir");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1 -> {
                    Administrador(a);
                }
                case 2 -> {
                    usuario(a);
                }
                case 3 -> {
                    seguir = false;
                }
                default -> {
                    System.out.println("Error");
                }
            }
        }
    }

    public static void Administrador(ArrayList<Aplicacion> a) {
        boolean seguir1 = true;
        while (seguir1) {
            System.out.println("1.Agregar Aplicación");
            System.out.println("2.Biblioteca");
            System.out.println("3.Actualización");
            System.out.println("4.Eliminar Aplicación");
            System.out.println("5.Estadísticas de Desarrollador");
            System.out.println("6.Salir");
            int opcion1 = lea.nextInt();
            switch (opcion1) {
                case 1 -> {
                    a.add(agregar_A());
                }
                case 2 -> {
                    Biblioteca(a);
                }
                case 3 -> {
                    if (a.size() > 0) {
                        int[] arreglo = Biblioteca(a);
                        boolean eleccion = Utilidad_o_Juego(a);
                        if (eleccion) {
                            if (arreglo[0] > 0) {
                                int posicion = 0;
                                do {
                                    System.out.println("Ingrese el indice de la app que desea modificar");
                                    posicion = lea.nextInt();
                                } while (posicion <= 0 || posicion > arreglo[0]);
                                int num1 = 0;
                                int num = 1;
                                for (Aplicacion apl : a) {
                                    if (apl instanceof App_utilidad) {
                                        if (num == posicion) {
                                            break;
                                        }
                                        num++;
                                    }
                                    num1++;
                                }
                                modificar(a, num1);
                            }
                        } else {
                            if (arreglo[1] > 0) {
                                int posicion = 0;
                                do {
                                    System.out.println("Ingrese el indice de la app que desea modificar");
                                    posicion = lea.nextInt();
                                } while (posicion <= 0 || posicion > arreglo[1]);
                                int num1 = 0;
                                int num = 1;
                                for (Aplicacion apl : a) {
                                    if (apl instanceof App_utilidad) {
                                        if (num == posicion) {
                                            break;
                                        }
                                        num++;
                                    }
                                    num1++;
                                }
                                modificar(a, num1);
                            }
                        }
                    }
                }
                case 4 -> {
                    if (a.size() > 0) {
                        int[] arreglo = Biblioteca(a);
                        boolean eleccion = Utilidad_o_Juego(a);
                        if (eleccion) {
                            if (arreglo[0] > 0) {
                                int posicion = 0;
                                do {
                                    System.out.println("Ingrese el indice de la app que desea eliminar");
                                    posicion = lea.nextInt();
                                } while (posicion <= 0 || posicion > arreglo[0]);
                                int num1 = 0;
                                int num = 1;
                                for (Aplicacion apl : a) {
                                    if (apl instanceof App_utilidad) {
                                        if (num == posicion) {
                                            break;
                                        }
                                        num++;
                                    }
                                    num1++;
                                }
                                a.remove(num1);
                            }
                        } else {
                            if (arreglo[1] > 0) {
                                int posicion = 0;
                                do {
                                    System.out.println("Ingrese el indice de la app que desea eliminar");
                                    posicion = lea.nextInt();
                                } while (posicion <= 0 || posicion > arreglo[1]);
                                int num1 = 0;
                                int num = 1;
                                for (Aplicacion apl : a) {
                                    if (apl instanceof App_utilidad) {
                                        if (num == posicion) {
                                            break;
                                        }
                                        num++;
                                    }
                                    num1++;
                                }
                                a.remove(num1);
                            }
                        }
                    }
                }
                case 5 -> {
                    estadisticas(a);
                }
                case 6 -> {
                    seguir1 = false;
                }
                default -> {
                    System.out.println("Error");
                }
            }
        }
    }

    public static void modificar(ArrayList<Aplicacion> a, int num) {
        String nombre = "";
        String desarrollador = "";
        int precio = -1;
        boolean seguir = true;
        while (seguir) {
            System.out.println("1.Modificar nombre");
            System.out.println("2.Modificar desarrollador");
            System.out.println("3.Modificar precio");
            System.out.println("4.Salir");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1 -> {
                    nombre = nombre();
                }
                case 2 -> {
                    desarrollador = desarrollador();
                }
                case 3 -> {
                    precio = precio();
                }
                case 4 -> {
                    a.get(num).setNombre(nombre);
                    a.get(num).setDesarrollador(desarrollador);
                    a.get(num).setPrecio(precio);
                    seguir = false;
                }
                default -> {
                    System.out.println("Error");
                }
            }
        }
    }

    public static boolean Utilidad_o_Juego(ArrayList<Aplicacion> a) {
        int num1 = 0;
        int num = 1;
        do {
            System.out.println("Seleccion");
            System.out.println("1.Utilidad");
            System.out.println("2.Juego");
            num1 = lea.nextInt();
        } while (num1 <= 0 || num1 >= 3);
        if (num1 == 1) {
            for (Aplicacion ap : a) {
                if (ap instanceof App_utilidad) {
                    System.out.println("App " + num + " de utilidad");
                    System.out.println(ap);
                    num++;
                }
            }
            return true;
        } else {
            System.out.println("\nApp de juegos");
            for (Aplicacion ap : a) {
                if (ap instanceof app_Juegos) {
                    System.out.println("App " + num + " de juego");
                    System.out.println(ap);
                    num++;
                }
            }
            return false;
        }
    }

    public static Aplicacion agregar_A() {
        String nombre = nombre();
        String desarrollador = desarrollador();
        int precio = precio();
        int num = 0;
        do {
            System.out.println("Tipo de app");
            System.out.println("1.Utilidad");
            System.out.println("2.Juegos");
            num = lea.nextInt();
        } while (num <= 0 || num >= 3);
        if (num == 1) {
            String categoría = categoría();
            return new App_utilidad(categoría, nombre, desarrollador, precio);
        } else {
            int Edad_Recomendada = Edad_Recomendada();
            return new app_Juegos(Edad_Recomendada, nombre, desarrollador, precio);
        }
    }

    public static void estadisticas(ArrayList<Aplicacion> a) {
        for (Aplicacion aplicacion : a) {
            System.out.println("Nombre:" + aplicacion.getNombre());
            System.out.println("Numero de descargas:" + aplicacion.getCantidad_descarga());
            System.out.println("Rating:" + aplicacion.getRating());
        }
    }

    public static String nombre() {
        String nombre = "";
        do {
            System.out.println("Ingrese el nombre de la app");
            nombre = lea.next();
        } while (nombre.length() == 0);
        return nombre;
    }

    public static String desarrollador() {
        String desarrollador = "";
        do {
            System.out.println("Ingrese el nombre de la desarrollador");
            desarrollador = lea.next();
        } while (desarrollador.length() == 0);
        return desarrollador;
    }

    public static int precio() {
        int precio = 0;
        do {
            System.out.println("Ingrese el precio de la app");
            precio = lea.nextInt();
        } while (precio < 0);
        return precio;
    }

    public static String categoría() {
        String categoría = "";
        do {
            System.out.println("Ingrese la categoría");
            categoría = lea.next();
        } while (categoría.length() == 0);
        return categoría;
    }

    public static int Edad_Recomendada() {
        int Edad_Recomendada = 0;
        do {
            System.out.println("Ingrese la edad recomendada");
            Edad_Recomendada = lea.nextInt();
        } while (Edad_Recomendada < 0);
        return Edad_Recomendada;
    }

    public static int[] Biblioteca(ArrayList<Aplicacion> a) {
        int[] arreglo = new int[2];
        System.out.println("\n--App de Utilidad--");
        System.out.println();
        int num = 1;
        for (Aplicacion ap : a) {
            if (ap instanceof App_utilidad) {
                System.out.println("App " + num + " de utilidad");
                System.out.println(ap);
                num++;
                System.out.println("");
            }
        }
        arreglo[0] = num;
        num = 1;
        System.out.println("\n--App de juegos--");
        System.out.println();
        for (Aplicacion ap : a) {
            if (ap instanceof app_Juegos) {
                System.out.println("App " + num + " de juego");
                System.out.println(ap);
                num++;
                System.out.println("");
            }
        }
        arreglo[1] = num;
        System.out.println();
        return arreglo;
    }

    public static void usuario(ArrayList<Aplicacion> a) {
        boolean seguir2 = true;
        while (seguir2) {
            System.out.println("1.Buscar por Nombre");
            System.out.println("2.Buscar por Categoría");
            System.out.println("3.Biblioteca");
            System.out.println("4.Mostrar Descargas");
            System.out.println("5.Eliminar Descargar");
            System.out.println("6.Calificar Aplicación");
            System.out.println("7.Salir");
            int opcion1 = lea.nextInt();
            switch (opcion1) {
                case 1 -> {
                    System.out.println("Ingrese el nombre de la app que desea buscar");
                    String nombre = lea.next();
                    int num = 1;
                    int num1 = 0;
                    String temp = "";
                    for (Aplicacion apl : a) {
                        if (apl.getNombre().equals(nombre)) {
                            System.out.println("App " + num);
                            System.out.println(apl);
                            num1++;
                            temp += num + "/";
                        }
                        num++;
                    }
                    if (num1 == 0) {
                        System.out.println("No se encontro ninguna app con este nombre");
                    } else {
                        String[] temp1 = temp.split("/");
                        int[] arreglo = new int[temp1.length];
                        for (int i = 0; i < temp1.length; i++) {
                            arreglo[i] = Integer.parseInt(temp1[i]);
                        }
                        boolean validando = true;
                        int num2 = 0;
                        do {
                            System.out.println("Ingrese el indice de la app");
                            num2 = lea.nextInt();
                            for (int i = 0; i < arreglo.length; i++) {
                                if (num2 == arreglo[i]) {
                                    validando = false;
                                }
                            }
                        } while (validando);
                        int num3 = 0;
                        do {
                            System.out.println("Si desea descargar esta aplicacion entonces ingrese 1 y sino desea descargar esta aplicacion ingrese 2");
                            num3 = lea.nextInt();
                        } while (num3 <= 0 || num3 >= 3);
                        if (num3 == 1) {
                            num2--;
                            int tempo = a.get(num2).getCantidad_descarga();
                            tempo++;
                            a.get(num2).setCantidad_descarga(tempo);
                            a.get(num2).setEstado(true);
                            System.out.println("App fue descargada");
                        } else {
                            System.out.println("App no fue descargada");
                        }
                    }
                }
                case 2 -> {
                    for (Aplicacion aplicacion : a) {
                        if (aplicacion instanceof App_utilidad) {
                            System.out.println("Categoria:" + ((App_utilidad) aplicacion).getCategoría());
                        }
                    }
                    System.out.println("Ingrese la categoria");
                    String cate = lea.next();
                    int num = 1;
                    for (Aplicacion apl : a) {
                        if (apl instanceof App_utilidad) {
                            if (((App_utilidad) apl).getCategoría().equals(cate)) {
                                System.out.println("App " + num);
                                System.out.println(apl);
                            }
                        }
                        num++;
                    }
                    int posicion = 0;
                    do {
                        System.out.println("Ingrese el numero de la app");
                        posicion=lea.nextInt();
                    } while (posicion <= 0);
                    if (posicion <= a.size()) {
                        posicion--;
                        if (a.get(posicion) instanceof App_utilidad) {
                            if (((App_utilidad) a.get(posicion)).getCategoría().equals(cate)) {
                                int tempo = a.get(posicion).getCantidad_descarga();
                                tempo++;
                                a.get(posicion).setCantidad_descarga(tempo);
                                a.get(posicion).setEstado(true);
                                System.out.println("La app fue descargada");
                            }
                        }
                    } else {
                        System.out.println("La app no fue descargada");
                    }
                }
                case 3 -> {
                    Biblioteca(a);
                }
                case 4 -> {
                    for (Aplicacion apl : a) {
                        if (apl.isEstado() == true) {
                            System.out.println(apl);
                        }
                    }
                    System.out.println();
                }
                case 5 -> {
                    int num = 1;
                    for (Aplicacion apl : a) {
                        if (apl.isEstado() == true) {
                            System.out.println("App " + num);
                            System.out.println(apl);
                        }
                        num++;
                    }
                    System.out.println("Ingrese el numero de la app que desea eliminar de descargas");
                    int temp = lea.nextInt();
                    if (temp > 0 && temp <= a.size()) {
                        temp--;
                        if (a.get(temp).isEstado() == true) {
                            a.get(temp).setEstado(false);
                        }
                    }
                }
                case 6 -> {
                    int num = 1;
                    for (Aplicacion apl : a) {
                        if (apl.isEstado() == true) {
                            System.out.println("App " + num);
                            System.out.println(apl);
                        }
                        num++;
                    }
                    System.out.println("Ingrese el numero de la app que desea eliminar de descargas");
                    int temp = lea.nextInt();
                    if (temp > 0 && temp <= a.size()) {
                        temp--;
                        if (a.get(temp).isEstado() == true) {
                            int calificacion = -1;
                            do {
                                System.out.println("Ingrese calificacion de la app");
                                calificacion = lea.nextInt();
                            } while (calificacion < 0 || calificacion >= 6);
                            a.get(temp).setRating(calificacion);
                        }
                    }
                }
                case 7 -> {
                    seguir2 = false;
                }
                default -> {
                    System.out.println("Error");
                }
            }
        }
    }
}
