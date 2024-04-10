import java.util.Scanner;

public class Vehiculo {
    private String marca;
    private String color;
    private String matricula;
//a
    public Vehiculo(String marca, String color, String matricula) {
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
    }

    public class Coche extends Vehiculo{
        private String filtros;
        private String bateria;
        private String retrovisor;
        private String bujias;
        private String faros;

        public Coche(String marca, String color, String matricula, String filtros, String bateria,
                     String retrovisor, String bujias, String faros) {
            super(marca, color, matricula);
            this.filtros = filtros;
            this.bateria = bateria;
            this.retrovisor = retrovisor;
            this.bujias = bujias;
            this.faros = faros;
        }
        public void reparar() {
            Scanner coche = new Scanner(System.in);
            System.out.println("Que pieza desea reparar?");
            String seleccion = coche.nextLine().toLowerCase();


            if (!seleccion.equals("filtros") && !seleccion.equals("bateria") && !seleccion.equals("retrovisor") && !seleccion.equals("bujias") && !seleccion.equals("faros")) {
                System.out.println("Pieza no encontrada");
                seleccion = null;
            }

            if (seleccion != null) {

                System.out.println("Se ha reparado el componente " + seleccion );

            }

        }
    }
    public class Camion extends Vehiculo {
        private String motor;
        private String transmision;
        private String ruedas;
        private String amortiguador;
        private String bocina;

        public Camion(String marca, String color, String matricula, String motor,
                      String transmision, String ruedas, String amortiguador, String bocina) {
            super(marca, color, matricula);
            this.motor = motor;
            this.transmision = transmision;
            this.ruedas = ruedas;
            this.amortiguador = amortiguador;
            this.bocina = bocina;
        }

        public void reparar() {
            Scanner camion = new Scanner(System.in);
            System.out.println("Que pieza desea reparar?");
            String seleccion = camion.nextLine().toLowerCase();


            if (!seleccion.equals("motor") && !seleccion.equals("transmision") && !seleccion.equals("ruedas") && !seleccion.equals("amortiguador") && !seleccion.equals("bocina")) {
                System.out.println("Pieza no encontrada");
                seleccion = null;
            }

            if (seleccion != null) {

                System.out.println("Se ha reparado el componente " + seleccion );

            }

        }
    }
    public class Tractor extends Vehiculo {
        private String contenedor;
        private String multiplicador;
        private String brazo;

        private String baliza;
        private String contrapeso;

        public Tractor(String marca, String color, String matricula, String contenedor, String multiplicador,
                       String brazo, String baliza, String contrapeso) {
            super(marca, color, matricula);
            this.contenedor = contenedor;
            this.multiplicador = multiplicador;
            this.brazo = brazo;
            this.baliza = baliza;
            this.contrapeso = contrapeso;
        }

        public void reparar() {
            Scanner tractor = new Scanner(System.in);
            System.out.println("Que pieza desea reparar?");
            String seleccion = tractor.nextLine().toLowerCase();


            if (!seleccion.equals("contenedor") && !seleccion.equals("multiplicador") && !seleccion.equals("brazo") && !seleccion.equals("baliza") && !seleccion.equals("contrapeso")) {
                System.out.println("Pieza no encontrada");
                seleccion = null;
            }

            if (seleccion != null) {

                System.out.println("Se ha reparado el componente " + seleccion );

            }

        }

    }
    public class Grua extends Vehiculo {
        private String gancho;
        private String controles;
        private String brazo;

        private String tirantes;
        private String pluma;

        public Grua(String marca, String color, String matricula, String gancho, String controles,
                    String brazo, String tirantes, String pluma) {
            super(marca, color, matricula);
            this.gancho = gancho;
            this.controles = controles;
            this.brazo = brazo;
            this.tirantes = tirantes;
            this.pluma = pluma;
        }

        public void reparar() {
            Scanner grua = new Scanner(System.in);
            System.out.println("Que pieza desea reparar?");
            String seleccion = grua.nextLine().toLowerCase();


            if (!seleccion.equals("gancho") && !seleccion.equals("controles") && !seleccion.equals("brazo") && !seleccion.equals("tirantes") && !seleccion.equals("pluma")) {
                System.out.println("Pieza no encontrada");
                seleccion = null;
            }

            if (seleccion != null) {

                System.out.println("Se ha reparado el componente " + seleccion );

            }

        }
    }
    public class Moto extends Vehiculo {

        private String cadena;
        private String chasis;
        private String retrovisor;
        private String manillar;
        private String asiento;

        public Moto(String marca, String color, String matricula,String cadena, String chasis, String retrovisor, String manillar, String asiento) {
            super(marca, color, matricula);
            this.cadena = cadena;
            this.chasis = chasis;
            this.retrovisor = retrovisor;
            this.manillar = manillar;
            this.asiento = asiento;
        }

        public void setAsiento(String asiento) {
            this.asiento = asiento;
        }
        public void reparar() {
            Scanner moto = new Scanner(System.in);
            System.out.println("Que pieza desea reparar?");
            String seleccion = moto.nextLine().toLowerCase();


            if (!seleccion.equals("cadena") && !seleccion.equals("chasis") && !seleccion.equals("retrovisor") && !seleccion.equals("manillar") && !seleccion.equals("asiento")) {
                System.out.println("Pieza no encontrada");
                seleccion = null;
            }

            if (seleccion != null) {

                System.out.println("Se ha reparado el componente " + seleccion );

            }

        }

    }
}
