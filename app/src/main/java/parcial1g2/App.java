
package parcial1g2;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner messi = new Scanner(System.in);
        // Logica de solución
        int vehiculos = 0;
        int modeloVehiculo = 0; 
        int avaluoVehiculo = 0;
        int totalapagar = 0;
        int impuestoRodamiento = 0;
        int seguro = 0;

        
        System.out.println("cuantos vehiculos desea calcular: ");
            vehiculos = messi.nextInt();
            messi.nextLine();




        for (int i = 0; i <= modeloVehiculo ; i++) {
            System.out.println("ingrese la decada del modelo del vehiculo (70, 80, 90, 00, 10, 20, otra): ");
            modeloVehiculo = messi.nextInt();
            messi.nextLine();

            System.out.println("ingrese el avaluo del vehiculo: " );
            avaluoVehiculo = messi.nextInt();
            messi.nextLine();

        if (avaluoVehiculo == 120000) {
            
            System.out.println("el total a pagar es: " + "90" + impuestoRodamiento + seguro);
            totalapagar = messi.nextInt();
            messi.nextLine();
        }
        
        if (avaluoVehiculo == 130000) {
            System.out.println("el total a pagar es: " + "00" + impuestoRodamiento + seguro);
            totalapagar = messi.nextInt();
            messi.nextLine();

            
        }

        if (avaluoVehiculo == 140000) {
            System.out.println("el total a pagar es: " + "10" + impuestoRodamiento + seguro);
            totalapagar = messi.nextInt();
            messi.nextLine();  

        }

        if (avaluoVehiculo == 150000) {
            System.out.println("el total a pagar es: " + "20" + impuestoRodamiento + seguro);
            totalapagar = messi.nextInt();
            messi.nextLine();
            
        }
            
    }
            
            






       
            
            
        }


            
        


    

    /*  Implemente una funcion llamada calcularTotalImpuestos que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa la decada (70, 80, 90, 00, 10, 20, Otra)
            - Un entero que representa avaluo del vehiculo
        * Retorna:
            - Un entero representando el valor total a pagar de los impuestos
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
        public static int calcularTotalImpuestos(String decada, int avaluo){
            int impuestoRodamiento = 0;
            int avaluo00 = 120000;
            int avaluo90 = 130000;
            int avaluo10 = 140000;
            int avaluo20 = 150000;
            int seguro = 0;
            

            try {
                switch (decada) {
                    case "00":
                        impuestoRodamiento = avaluo00 * 0.0409;
                        seguro = avaluo00 * 0.816;
                        break;
                    case "90":
                        impuestoRodamiento = avaluo90 * 0.0434;
                        seguro = avaluo90 * 0.798;
                        break;
                    case "10":
                        impuestoRodamiento = avaluo10 * 0.0493;
                        seguro = avaluo10 * 0.712;
                        break;
                    case "20":
                        impuestoRodamiento = avaluo20 * 0.0568;
                        seguro = avaluo20 * 0.699;
                        break;

                
                    default:
                        break;
                    
                        
                }
                return impuestoRodamiento + seguro;

            } catch (Exception e) {
                System.out.println("Error"+ e.getMessage());
                return -1;
            }
            
        }
    }

    //------------------------------------------------------------------


