/*
 * Diseñe e implemente una clase denominada Reparacion_VehiculosApp que contenga
los siguientes atributos:
- Modelo de vehiculo de tipo String y;
- cantidad de vehiculo de tipo int;
e implemente, los metodos get, set y toString; un constructor sobrecargado, y
otro constructor que permita inicializar las variables de la clase;
adicionalmente, implemente, dos metodos especiales;
* Ingresar_Vehiculos(int cantidad_vehiculo); se ingresan vehiculos al taller,
si la cantidad ingresada  son numeros flotantes, la cantidad de vehiculos
reparados es cero (0), es decir no hay vehiculos.
* Retirar_Vehiculos(int cantidad_vehiculo); Retirar vehiculos, considerando que,
si el vehiculo ingresado es cero(0) significa que no hay behiculos.
 */
package reparacion_vehiculosapp;

/**
 *
 * @author VEGA MASAPANTA JESSICA MARIBEL
 */
class Reparacion {

    //Atributos
    private String taller;
    private int cantidad_vehiculo;

    //Constructores
    public Reparacion(String taller){
        this(taller,0); //Sobrecarga
    }

    public Reparacion(String taller, int cantidad_vehiculo){
        this.taller = taller;
        //Si la cantidad_vehiculo es menor que cero, le ponemos a cero.
        if (cantidad_vehiculo < 0){
           this.cantidad_vehiculo= 0;
        }  else {
              this.cantidad_vehiculo= cantidad_vehiculo;
        }
    }

    //Métodos
    public void setTaller(String taller){ //Set, modifica o almacena el valor en la variable.
         this.taller= taller;
    }
    public String getTaller(){  //get, muestra o extrae el valor del dato.
       return taller;
    }

    public void setCantidad_Vehiculo (int cantidad_vehiculo) {
          this.cantidad_vehiculo= cantidad_vehiculo;
    }
    public int getCantidad_Vehiculo(){
         return cantidad_vehiculo;
    }

   /**
    * Ingersa vehiculos al taller,
    * solo si es positovo la cantidad_vehiculo
    */

    public void Ingresar_Vehiculo(int cantidad_vehiculo){
       if(cantidad_vehiculo > 0){
           this.cantidad_vehiculo += cantidad_vehiculo;
       } //cantidad_vehiculo += cantidad_vehiculo+vehiculo
    }

    /**
     * Retira una cantidad_vehiculo del taller, si se ingresara un valor negativo
     * se quedaria en cero.
     */

    public void Retirar_Vehiculo(int cantidad_vehiculo){
        if (cantidad_vehiculo < 0){
           this.cantidad_vehiculo = cantidad_vehiculo;
        } else{
           this.cantidad_vehiculo -=cantidad_vehiculo;
        }//cantidad_vehiculo =cantidad_vehiculo-cantidad_vehiculo
    }

    /**
     * Devuelve el estado del objeto
     *
     * @return
     */

    @Override
    public String toString(){
       return "El taller " + taller +  "tiene " + cantidad_vehiculo +
               " vehiculos por reparar " ;
    }
}

//Clase ejecutable
public class Reparacion_VehiculosApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Reparacion cuenta_1=new Reparacion("Martinez ");
       Reparacion cuenta_2=new Reparacion("Vega ", 3);

       //Ingreso de vehiculos al taller
       cuenta_1.Ingresar_Vehiculo(3);
       cuenta_2.Ingresar_Vehiculo(6);

       //Retiro de vehiculos del taller
       cuenta_1.Retirar_Vehiculo(3);
       cuenta_2.Retirar_Vehiculo(6);

       //Presentación de infromación de vehiculos
       System.out.println(cuenta_1);// 0 vehiculo
       System.out.println(cuenta_2); // 3 vehiculos
    }
}
