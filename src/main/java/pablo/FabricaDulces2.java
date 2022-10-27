/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pablo;

import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class FabricaDulces2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables de la opcion a elegir=Calcular
        String opcion;
        String opcion2;
        //Variables constantes
        //MantecadosLimon y Turronchocolate
        //Control+R para cmabiar el nombre de una variable y se cambiene en todas
        double costeManoDeObra;

        //Polvorones,turron clasico y mazapanes
        //Variables
        double costeMateriaPrima;//Introducir en el panel entre 0,1 y 1€
        double costeProduccionUnidad;
        double precioVenta;
        double beneficio;
        double objetivo;

        //PreMenu para calcular o salir
        String menu = """
                        Escriba lo quiere hacer.
                  --------------------------------------
                       Calcular=="Viabilidad de Productos"
                       Salir== "Salir del programa"
                  --------------------------------------
                  
                  
                  
                  """;
        //Bucle que contiene todo el programa en cuanto le decimos Salir termina completamente
        do {

            //El programa debe tener dos opciones, la primera es realizar los cálculos para ver 
            //la viabilidad de los productos y la segunda debe ser “terminar”. Para terminar
            //el programa el usuario debe escribir la palabra Salir (ignorando mayúsculas y minúsculas).
            //En caso de escribir otra cosa, el programa volverá al menú principal.
            opcion = JOptionPane.showInputDialog(null, menu);
            //Si elegimos calcular ignorando Mayusculas y minusculas
            if (opcion.equalsIgnoreCase("calcular")) {
                //Si elegimos calcular 
                //Panel salida de datos
                JOptionPane.showMessageDialog(null, "Has elegido calcular producto ");
                //Sale el menu con las opciones y si escribimos salir nos salimos si no 
                //Menu con las opciones
                String menu2 = """
                                "La Esteponera Turronera"
                    -----------------------------------------------------------------
                    Introduce el Codigo que quieres calcular
                    -----------------------------------------------------------------
                                1.Mantecadosde limon---> M1
                                2.Turron de chocolate--> T1
                                3.Polvorones-----------> M2
                                4.Turron clasico-------> T2
                                5.Mazapanes------------> P1
                                6.Escribar-->"Salir" para terminar programa.
                    """;
                //bucle del menu de los codigos
                do {
                    opcion2 = JOptionPane.showInputDialog(null, menu2).toLowerCase();

                } while (!(opcion2.equalsIgnoreCase("M1")
                        || opcion2.equalsIgnoreCase("T1")
                        || opcion2.equalsIgnoreCase("M2")
                        || opcion2.equalsIgnoreCase("T1")
                        || opcion2.equalsIgnoreCase("P1")
                        || opcion2.equalsIgnoreCase("Salir")));
                //EL lowerCase en el switch para que en los case puestos en minusculas 
                //(SI o sSI) tienen que ir en minusculas si se hacen en mayuscula los transforma
                //Inicio del Switch
                switch (opcion2.toLowerCase()) {

                    case "m1":
                        //Mantecadosde limon---> M1
                        //coste producción = materia prima + mano de obra
                        //Panel Introduccion de datos
                        //Bucle que se le introduce la materia prima
                        do {
                            String costeString = JOptionPane.showInputDialog("Introduce el "
                                    + "coste de la materia prima(entre 0.1€ y 1€)");
                            //Parse del string a double
                            costeMateriaPrima = Double.parseDouble(costeString);
                            //Salida de datos
                            JOptionPane.showMessageDialog(null, "El coste de la"
                                    + " materia es de " + costeMateriaPrima);
                            //! y lo que este entre los parentesis  significa
                            //que todo lo que no se haga en el parentesis , se repetira
                        } while (!(costeMateriaPrima >= 0.1 && costeMateriaPrima <= 1));
                        //Comienzo del if con la condicion 
                        if (costeMateriaPrima >= 0.1 && costeMateriaPrima <= 1) {
                            //Bucle que calcula la mano de obra, con sus filtros
                            do {
                                String costeObraString = JOptionPane.showInputDialog("Introduce el "
                                        + "coste de la mano de obra(entre 0.5€ y 0.9€)");
                                //Parse del string a double
                                costeManoDeObra = Double.parseDouble(costeObraString);
                                //Salida de datos
                                JOptionPane.showMessageDialog(null, "El coste de la"
                                        + " mano de obra " + costeManoDeObra);
                                //! y lo que este entre los parentesis  significa
                                //que todo lo que no se haga en el parentesis , se repetira
                                //Condicion del bucle
                            } while (!(costeManoDeObra >= 0.5 && costeManoDeObra <= 0.9));

                            //Calculo coste unidad
                            costeProduccionUnidad = costeManoDeObra + costeMateriaPrima;

                            //Calculo del precio de venta
                            precioVenta = costeProduccionUnidad + (costeProduccionUnidad * 0.5);

                            //Calculo beneficio
                            beneficio = precioVenta - costeProduccionUnidad;
                            //salida de datos
                            String resultado = """
                                        Un Mantecado de Limon (M1) nos cuesta : %.2f Centimos
                                        El precio de venta es de: %.2f Centimos
                                        El beneficio es de: %.2f Centimos
                                     """.formatted(costeProduccionUnidad, precioVenta, beneficio);
                            JOptionPane.showMessageDialog(null, resultado);
                            //Calculo del objetivo de 2500 euros
                            JOptionPane.showMessageDialog(null, "Se va a calcular "
                                    + "cuantos unidades a producir para que haya un "
                                    + "beneficio de al menos 2500€");
                            objetivo = 2500 * 1 / beneficio;
                            //(int para declarar el double en int y el ceil para redondear hacia arriba)
                            JOptionPane.showMessageDialog(null, " Necesitamos "
                                    + "fabricar " + (int) Math.ceil(objetivo) + " Mantecados ");
                            //Fin
                        } else {
                            JOptionPane.showMessageDialog(null, " Error, "
                                    + "precio no permitido");

                        }

                        break;

                    case "t1":
                        //Turron Chococate---> T1
                        //coste producción = materia prima + mano de obra
                        //Introduccion de datos

                        do {
                            String costeString = JOptionPane.showInputDialog("Introduce el "
                                    + "coste de la materia prima(entre 0.1€ y 1€)");
                            //Parse del string a double
                            costeMateriaPrima = Double.parseDouble(costeString);
                            //Salida de datos
                            JOptionPane.showMessageDialog(null, "El coste de la"
                                    + " materia es de " + costeMateriaPrima);
                            //! y lo que este entre los parentesis  significa
                            //que todo lo que no se haga en el parentesis , se repetira
                        } while (!(costeMateriaPrima >= 0.1 && costeMateriaPrima <= 1));
                        //Comienzo del if con la condicion 
                        if (costeMateriaPrima >= 0.1 && costeMateriaPrima <= 1) {

                            do {
                                String costeObraString = JOptionPane.showInputDialog("Introduce el "
                                        + "coste de la mano de obra(entre 0.5€ y 0.9€)");
                                //Parse del string a double
                                costeManoDeObra = Double.parseDouble(costeObraString);
                                //Salida de datos
                                JOptionPane.showMessageDialog(null, "El coste de la"
                                        + " mano de obra " + costeManoDeObra);
                                //! y lo que este entre los parentesis  significa
                                //que todo lo que no se haga en el parentesis , se repetira
                            } while (!(costeManoDeObra >= 0.5 && costeManoDeObra <= 0.9));

                            //Calculo coste unidad
                            costeProduccionUnidad = costeManoDeObra + costeMateriaPrima;

                            //Calculo del precio de venta
                            precioVenta = costeProduccionUnidad + (costeProduccionUnidad * 0.65);

                            //Calculo beneficio
                            beneficio = precioVenta - costeProduccionUnidad;

                            String resultado = """
                                        Un Turron de chocolate (T1) nos cuesta : %.2f Centimos
                                        El precio de venta es de: %.2f Centimos
                                        El beneficio es de: %.2f Centimos
                                     """.formatted(costeProduccionUnidad,
                                    precioVenta, beneficio);

                            JOptionPane.showMessageDialog(null, resultado);

                            JOptionPane.showMessageDialog(null, "Se va a"
                                    + " calcular cuantos "
                                    + "unidades a producir para que haya un"
                                    + " beneficio de al menos 2500€");
                            objetivo = 2500 * 1 / beneficio;
                            //(int para declarar el double en int y el ceil para redondear hacia arriba)
                            JOptionPane.showMessageDialog(null, " Necesitamos"
                                    + " fabricar "
                                    + (int) Math.ceil(objetivo) + " Turrones ");

                            break;

                        } else {
                            JOptionPane.showMessageDialog(null, " Error, "
                                    + "precio no permitido");
                        }

                        break;

                    case "m2":

                        //Polvorones--->M2
                        //coste producción = materia prima + mano de obra
                        //Introduccion de datos
                        do {
                            String costeString = JOptionPane.showInputDialog("Introduce el "
                                    + "coste de la materia prima(entre 0.1€ y 1€)");
                            //Parse del string a double
                            costeMateriaPrima = Double.parseDouble(costeString);
                            //Salida de datos
                            JOptionPane.showMessageDialog(null, "El coste de la"
                                    + " materia es de " + costeMateriaPrima);
                            //! y lo que este entre los parentesis  significa
                            //que todo lo que no se haga en el parentesis , se repetira
                        } while (!(costeMateriaPrima >= 0.1 && costeMateriaPrima <= 1));
                        //Comienzo del if con la condicion 
                        if (costeMateriaPrima >= 0.1 && costeMateriaPrima <= 1) {

                            do {
                                String costeObraString = JOptionPane.showInputDialog("Introduce el "
                                        + "coste de la mano de obra(entre 0.5€ y 0.9€)");
                                //Parse del string a double
                                costeManoDeObra = Double.parseDouble(costeObraString);
                                //Salida de datos
                                JOptionPane.showMessageDialog(null, "El coste de la"
                                        + " mano de obra " + costeManoDeObra);
                                //! y lo que este entre los parentesis  significa
                                //que todo lo que no se haga en el parentesis , se repetira
                            } while (!(costeManoDeObra >= 0.5 && costeManoDeObra <= 0.9));

                            //Calculo coste unidad
                            costeProduccionUnidad = costeManoDeObra + costeMateriaPrima;

                            precioVenta = costeProduccionUnidad
                                    + (costeProduccionUnidad * 0.5);

                            //Calculo beneficio
                            beneficio = precioVenta - costeProduccionUnidad;

                            String resultado = """
                                        Un Polvoron (M2) nos cuesta : %.2f Centimos
                                        El precio de venta es de: %.2f Centimos
                                        El beneficio es de: %.2f Centimos
                                     """.formatted(costeProduccionUnidad,
                                    precioVenta, beneficio);

                            JOptionPane.showMessageDialog(null, resultado);

                            JOptionPane.showMessageDialog(null, "Se va a "
                                    + "calcular cuantos unidades a producir para que haya un "
                                    + "beneficio de al menos 2500€ ");
                            objetivo = 2500 * 1 / beneficio;
                            JOptionPane.showMessageDialog(null, " Necesitamos"
                                    + " fabricar " + (int) Math.ceil(objetivo) + " Polvorones");
                            //Pase
                        } else {
                            JOptionPane.showMessageDialog(null, " Error,"
                                    + " precio no permitido");

                        }

                        break;
                    case "t2":
                        //Turron clasico---> T2
                        //coste producción = materia prima + mano de obra

                        do {
                            String costeString = JOptionPane.showInputDialog("Introduce el "
                                    + "coste de la materia prima(entre 0.1€ y 1€)");
                            //Parse del string a double
                            costeMateriaPrima = Double.parseDouble(costeString);
                            //Salida de datos
                            JOptionPane.showMessageDialog(null, "El coste de la"
                                    + " materia es de " + costeMateriaPrima);
                            //! y lo que este entre los parentesis  significa
                            //que todo lo que no se haga en el parentesis , se repetira
                        } while (!(costeMateriaPrima >= 0.1 && costeMateriaPrima <= 1));
                        //Comienzo del if con la condicion 
                        if (costeMateriaPrima >= 0.1 && costeMateriaPrima <= 1) {

                            do {
                                String costeObraString = JOptionPane.showInputDialog("Introduce el "
                                        + "coste de la mano de obra(entre 0.5€ y 0.9€)");
                                //Parse del string a double
                                costeManoDeObra = Double.parseDouble(costeObraString);
                                //Salida de datos
                                JOptionPane.showMessageDialog(null, "El coste de la"
                                        + " mano de obra " + costeManoDeObra);
                                //! y lo que este entre los parentesis  significa
                                //que todo lo que no se haga en el parentesis , se repetira
                            } while (!(costeManoDeObra >= 0.5 && costeManoDeObra <= 0.9));

                            //Calculo coste unidad
                            costeProduccionUnidad = costeManoDeObra + costeMateriaPrima;

                            //Calculo del precio de venta
                            precioVenta = costeProduccionUnidad
                                    + (costeProduccionUnidad * 0.65);

                            //Calculo beneficio
                            beneficio = precioVenta - costeProduccionUnidad;
                            //salida de datos
                            String resultado = """
                                        Un Turron clasico (T2) nos cuesta : %.2f Centimos
                                        El precio de venta es de: %.2f Centimos
                                        El beneficio es de: %.2f Centimos
                                     """.formatted(costeProduccionUnidad, precioVenta, beneficio);
                            JOptionPane.showMessageDialog(null, resultado);

                            JOptionPane.showMessageDialog(null, "Se va"
                                    + " a calcular cuantos unidades a producir para que"
                                    + " haya un beneficio de al menos 2500€");
                            objetivo = 2500 * 1 / beneficio;

                            //(int para declarar el double en int y el ceil
                            //para redondear hacia arriba)
                            JOptionPane.showMessageDialog(null, " Necesitamos"
                                    + "fabricar " + (int) Math.ceil(objetivo) + " Turrones clasicos ");
                            //Pase

                        } else {
                            JOptionPane.showMessageDialog(null, " Error,"
                                    + " precio no permitido");

                        }

                        break;

                    case "p1":
                        //Mazapanes---> P1
                        //coste producción = materia prima + mano de obra
                        do {
                            String costeString = JOptionPane.showInputDialog("Introduce el "
                                    + "coste de la materia prima(entre 0.1€ y 1€)");
                            //Parse del string a double
                            costeMateriaPrima = Double.parseDouble(costeString);
                            //Salida de datos
                            JOptionPane.showMessageDialog(null, "El coste de la"
                                    + " materia es de " + costeMateriaPrima);
                            //! y lo que este entre los parentesis  significa
                            //que todo lo que no se haga en el parentesis , se repetira
                        } while (!(costeMateriaPrima >= 0.1 && costeMateriaPrima <= 1));
                        //Comienzo del if con la condicion 
                        if (costeMateriaPrima >= 0.1 && costeMateriaPrima <= 1) {

                            do {
                                String costeObraString = JOptionPane.showInputDialog("Introduce el "
                                        + "coste de la mano de obra(entre 0.5€ y 0.9€)");
                                //Parse del string a double
                                costeManoDeObra = Double.parseDouble(costeObraString);
                                //Salida de datos
                                JOptionPane.showMessageDialog(null, "El coste de la"
                                        + " mano de obra " + costeManoDeObra);
                                //! y lo que este entre los parentesis  significa
                                //que todo lo que no se haga en el parentesis , se repetira
                            } while (!(costeManoDeObra >= 0.5 && costeManoDeObra <= 0.9));

                            //Calculo coste unidad
                            costeProduccionUnidad = costeManoDeObra + costeMateriaPrima;

                            //Calculo del precio de venta
                            precioVenta = costeProduccionUnidad + (costeProduccionUnidad * 0.5);

                            //Calculo beneficio
                            beneficio = precioVenta - costeProduccionUnidad;

                            String resultado = """
                                        Un Polvoron (M2) nos cuesta : %.2f Centimos
                                        El precio de venta es de: %.2f Centimos
                                        El beneficio es de: %.2f Centimos
                                     """.formatted(costeProduccionUnidad,
                                    precioVenta, beneficio);
                            JOptionPane.showMessageDialog(null, resultado);

                            JOptionPane.showMessageDialog(null, "Se va"
                                    + " a calcular cuantos unidades a producir para que"
                                    + " haya un beneficio de al menos 2500€");
                            objetivo = 2500 * 1 / beneficio;
                            //Int para declarar la variable se muestre en int y ceil para redondear hacia arriba
                            JOptionPane.showMessageDialog(null, " Necesitamos"
                                    + " fabricar " + (int) Math.ceil(objetivo) + " Mazapanes");
                            //Pase
                        } else {
                            JOptionPane.showMessageDialog(null, " Error"
                                    + ", precio no permitido");

                        }

                        break;
                    default:

                }

            }
            //Escribir para que cuando ponga otra cosa se repita,equalspara que ignore minusculas y mayusuclas
        } while (!(opcion.equalsIgnoreCase("salir")));

    }

}
