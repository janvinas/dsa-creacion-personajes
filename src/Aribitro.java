import java.util.List;

public class Aribitro {


    // El árbitro puede administrar las reglas del juego y tratar los hechizos
    public void asignarHechizos(PersonajeBuilder personaje, List<String> hechizosDisponibles) {
        String p=personaje.getTipo().toString();
        System.out.println("Asignando hechizos para el personaje: " + p);

        // asignar hechizos viene determinada por la profesión del personaje
        if (personaje.getTipo().toString().equalsIgnoreCase("Mago") || personaje.getTipo().toString().equalsIgnoreCase("Clerigo")) {
            for (String hechizo : hechizosDisponibles) {
                personaje.agregarHechizo(hechizo);
            }
            System.out.println("Hechizos asignados a " + p + ": " + hechizosDisponibles);
        } else {
            System.out.println("El personaje " + p + " no puede aprender hechizos.");
        }
    }

    //mostrar una lista de hechizos para que los jugadores elijan
    public void mostrarOpcionesDeHechizos(List<String> hechizosDisponibles) {
        System.out.println("Hechizos disponibles para elegir: " + hechizosDisponibles);
    }

}
