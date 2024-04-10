import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccionar vehiculo");
            System.out.println("1. Coche");
            System.out.println("2. Moto");
            System.out.println("3. Grua");
            System.out.println("4. Camion");
            System.out.println("5. Tractor");
            System.out.print("seleccione opcion:");

            opcion = scanner.nextInt();

            switch(opcion) {


                case 1:

                    System.out.println("Has seleccionado el coche:\n¿Qué pieza deseas reparar?");
                    System.out.println("1. filtros");
                    System.out.println("2. bateria");
                    System.out.println("3. retrovisor");
                    System.out.println("4. bujias");
                    System.out.println("5. faros");
//                    Vehiculo vehiculo = new Vehiculo("1234 ABC", "Rojo", "Tesla Model S");
//                    vehiculo.reparar;
                    break;
                case 2:
                    System.out.println("Has seleccionado la moto:\n¿Qué pieza deseas reparar?");
                    System.out.println("1. cadena");
                    System.out.println("2. chasis");
                    System.out.println("3. retrovisor");
                    System.out.println("4. manillar");
                    System.out.println("5. asiento");
//                    Vehiculo vehiculo = new Vehiculo("1234 ABC", "Rojo", "Tesla Model S");
//                    vehiculo.reparar;
                    break;
                case 3:
                    System.out.println("Has seleccionado la Grua:\n¿Qué pieza deseas reparar?");
                    System.out.println("1. gancho");
                    System.out.println("2. controles");
                    System.out.println("3. brazo");
                    System.out.println("4. tirantes");
                    System.out.println("5. pluma");
//                    Vehiculo vehiculo = new Vehiculo("1234 ABC", "Rojo", "Tesla Model S");
//                    vehiculo.reparar;
                    break;
                case 4:
                    System.out.println("Has seleccionado la Camion:\n¿Qué pieza deseas reparar?");
                    System.out.println("1. motor");
                    System.out.println("2. transmision");
                    System.out.println("3. ruedas");
                    System.out.println("4. amortiguador");
                    System.out.println("5. bocina");
//                    Vehiculo vehiculo = new Vehiculo("1234 ABC", "Rojo", "Tesla Model S");
//                    vehiculo.reparar;
                    break;
                case 5:
                    System.out.println("Has seleccionado la Tractor:\n¿Qué pieza deseas reparar?");
                    System.out.println("1. contenedor");
                    System.out.println("2. multiplicador");
                    System.out.println("3. brazo");
                    System.out.println("4. baliza");
                    System.out.println("5. contrapeso");
//                    Vehiculo vehiculo = new Vehiculo("1234 ABC", "Rojo", "Tesla Model S");
//                    vehiculo.reparar;
                    break;

                case 6:
                    scanner.close();
                    break;

                default:
                    System.out.println("Seleccione una opción válida");
            }

            System.out.println();

        } while(opcion != 7);
    }

}




