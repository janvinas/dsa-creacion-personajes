package characters;

public abstract class Personaje {

    int fuerza;
    int inteligencia;
    int sabiduria;
    int destreza;
    int constitucion;
    int carisma;

    public Personaje(int fuerza, int inteligencia, int sabiduria, int destreza, int constitucion, int carisma){
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.destreza = destreza;
        this.constitucion = constitucion;
        this.carisma = carisma;
    }

    public void printInfo(){
        System.out.println("\nTipo de personaje: " + this.getClass().getSimpleName());
        System.out.println("Fuerza: " + this.fuerza);
        System.out.println("Inteligencia: " + this.inteligencia);
        System.out.println("Sabiduria: " + this.sabiduria);
        System.out.println("Destreza: " + this.destreza);
        System.out.println("Constitucion: " + this.constitucion);
        System.out.println("Carisma: " + this.carisma);
    }

}
