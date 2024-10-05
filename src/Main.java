import characters.Clerigo;

public class Main {
    public static void main(String[] args) {
        PersonajeBuilder clerigoBuilder = new PersonajeBuilder(ClasePersonaje.Clerigo);
        Clerigo clerigo = (Clerigo) clerigoBuilder.build();
        clerigo.printInfo();
    }
}