import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        /*Contextualización:
        El centro de eventos Royal ofrece alquiler de espacios y servicios adicionales con condiciones
        especiales según el evento.
        Menú de opciones:
        1. Alquilar salón
        2. Alquilar área al aire libre
        3. Contratar servicios adicionales
        Condiciones:
        Opción 1 - Alquilar salón:
        Solicitar duración del evento en horas y día de la semana.
• Si el evento dura más de 5 horas, aplicar 15% de descuento.
• Si es en sábado o domingo, aplicar recargo del 20%.

        Opción 2 - Alquilar área al aire libre:
        Solicitar tipo de evento y número de personas.
• Eventos infantiles con más de 20 personas obtienen 10% de descuento.
• Eventos sociales con más de 50 personas tienen recargo del 10%.

        Opción 3 - Contratar servicios adicionales:
        Solicitar el servicio.
• Sonido e iluminación básica no tienen costo.
• Catering y decoración tienen tarifa adicional.*/

        double descuentoHoraAlquilerSalon = 0, descuentoDiaAlquilerSalon = 0, duracionEventoSalon = 0, precioTotalHora = 0, precioTotalDia = 0;
        double precioconDescuentoHora = 0, precioconDescuentoDia = 0;
        String diaSalon = "diaSalon";

        double precioSalonxHora = 80000;


        System.out.println("Alquiler de espacios para eventos Royal: ");
        System.out.println("\n1- Alquilar salon, \n2- Alquilar area al aire libre, \n3- contratar servicios adicionales");
        String alquilerEspacio,alquilerAireLibre = leer.nextLine();



        String personas= "personas";


        switch (alquilerEspacio) {
            case "1":


                precioconDescuentoHora = (precioSalonxHora * duracionEventoSalon) * 0.15;
                precioconDescuentoDia = (precioSalonxHora * duracionEventoSalon) * 0.2;
                precioTotalDia = (precioSalonxHora * duracionEventoSalon) - precioconDescuentoDia;
                precioTotalHora = (precioSalonxHora * duracionEventoSalon) - precioconDescuentoHora;

                System.out.println("Cual es la duracion del evento(horas)");
                duracionEventoSalon = leer.nextDouble();

                System.out.println("en que dia sera el evento");
                diaSalon = leer.nextLine();

                if (duracionEventoSalon > 5) {
                    System.out.println("Se te aplicará un descuento del 15% :" + precioconDescuentoHora);
                    System.out.println("Tu precio sera: " + precioTotalHora);
                } else   {
                    System.out.println("Tu precio sera: " + precioSalonxHora * duracionEventoSalon);}

                System.out.println("Se te aplicará un descuento del 20%" + precioconDescuentoDia);
                System.out.println("tu precio sera: " + precioTotalDia);
            } else if (diaSalon.equals("sabado") || diaSalon.equals("domingo"))  {
                System.out.println("Tu precio sera: " + precioSalonxHora * duracionEventoSalon);
            }






                break;

        switch (alquilerAireLibre) {

            case "2":
            System.out.println("cual es el evento a realizar: \n-1 evento infantil, \n-2 evento social"  )
            System.out.println("Cuantas personas asisten" )
                personas= leer.nextLine();

            switch (alquilerAireLibre) {

                case "1":
                    if (personas>20 ) {

                    }

            }



        }



        }


   }
