import characters.Clerigo;
import characters.Enano;
import characters.Guerrero;
import characters.Mago;

public class Main {
    public static void main(String[] args) {
        PersonajeBuilder clerigoBuilder = new PersonajeBuilder(ClasePersonaje.Clerigo);
        clerigoBuilder.setCarisma(13);
        clerigoBuilder.setConstitution(8);
        clerigoBuilder.setDestreza(10);
        clerigoBuilder.setFuerza(8);
        clerigoBuilder.setInteligencia(14);
        clerigoBuilder.setSabiduria(13);
        Clerigo clerigo = (Clerigo) clerigoBuilder.build();
        clerigo.printInfo();

        PersonajeBuilder enanoBuilder = new PersonajeBuilder(ClasePersonaje.Enano);
        Enano enano = (Enano) enanoBuilder.buildRandom();
        enano.printInfo();

        PersonajeBuilder guerreoBuilder = new PersonajeBuilder(ClasePersonaje.Guerrero);
        Guerrero guerrero = (Guerrero) guerreoBuilder.buildRandom();
        guerrero.printInfo();

        PersonajeBuilder magoBuilder = new PersonajeBuilder(ClasePersonaje.Mago);
        Mago mago = (Mago) magoBuilder.buildRandom();
        mago.printInfo();
    }
}