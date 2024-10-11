import characters.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Personaje de ejemplo:");

        PersonajeBuilder clerigoBuilder = new PersonajeBuilder(ClasePersonaje.Clerigo);
        PersonajeBuilder elfoBuilder = new PersonajeBuilder(ClasePersonaje.Elfo);
        PersonajeBuilder enanoBuilder = new PersonajeBuilder(ClasePersonaje.Enano);
        PersonajeBuilder guerreroBuilder = new PersonajeBuilder(ClasePersonaje.Guerrero);
        PersonajeBuilder ladronBuilder = new PersonajeBuilder(ClasePersonaje.Ladron);
        PersonajeBuilder magoBuilder = new PersonajeBuilder(ClasePersonaje.Mago);
        PersonajeBuilder medianoBuilder = new PersonajeBuilder(ClasePersonaje.Mediano);

        clerigoBuilder.setCarisma(13);
        clerigoBuilder.setConstitution(8);
        clerigoBuilder.setDestreza(10);
        clerigoBuilder.setFuerza(8);
        clerigoBuilder.setInteligencia(14);
        clerigoBuilder.setSabiduria(13);
        Clerigo clerigo = (Clerigo) clerigoBuilder.build();
        clerigo.printInfo();

        int i = 1;
        while(i == 1) {
            System.out.println("\nGeneración de personajes:");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Para crear su personaje introduzca nombre de la clase deseada.");
            System.out.println("Clases a escoger: Clerigo, Elfo, Enano, Guerrero, Ladron, Mago, Mediano.");
            System.out.println("Para salir escriba: Salir");
            System.out.println("Clase deseada:");

            String generador = scanner.nextLine();

            switch (generador) {
                case "Clerigo":
                    Clerigo C1 = (Clerigo) clerigoBuilder.buildRandom();
                    C1.printInfo();
                    break;
                case "Elfo":
                    Elfo El1 = (Elfo) elfoBuilder.buildRandom();
                    El1.printInfo();
                    break;
                case "Enano":
                    Enano En1 = (Enano) enanoBuilder.buildRandom();
                    En1.printInfo();
                    break;
                case "Guerrero":
                    Guerrero G1 = (Guerrero) guerreroBuilder.buildRandom();
                    G1.printInfo();
                    break;
                case "Ladron":
                    Ladron L1 = (Ladron) ladronBuilder.buildRandom();
                    L1.printInfo();
                    break;
                case "Mago":
                    Mago Ma1 = (Mago) magoBuilder.buildRandom();
                    Ma1.printInfo();
                    break;
                case "Mediano":
                    Mediano Me1 = (Mediano) medianoBuilder.buildRandom();
                    Me1.printInfo();
                    break;
                case "Salir":
                    i = 0;
            }
        }


            Scanner scanner = new Scanner(System.in);


            System.out.print("value to reduce (fuerza): ");
            int fuerzaToReduce = scanner.nextInt();

            System.out.print("value to reduce (inteligencia): ");
            int inteligenciaToReduce = scanner.nextInt();

            System.out.print("value to reduce (sabiduria): ");
            int sabiduriaToReduce = scanner.nextInt();


            System.out.print("write done the code for each type of caracter 1:Clerigo, 2:Elfo, 3:Enano, 4:Guerrero, 5:Ladron, 6:Mago, 7:Mediano: ");
            int characterClass = scanner.nextInt();


            AttributeAdjuster adjuster = new AttributeAdjuster
                    (
                            clerigo.getFuerza(),
                            clerigo.getInteligencia(),
                            clerigo.getSabiduria(),
                            clerigo.getDestreza(),
                            clerigo.getConstitucion(),
                            clerigo.getCarisma()
                    );


            try {
                adjuster.adjustAttributes(fuerzaToReduce, inteligenciaToReduce, sabiduriaToReduce, characterClass);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                scanner.close();
                return; // 如果调整失败，则提前退出 exit if fail
            }

            // 打印调整后的角色信息 print new value
            System.out.println("\nnew value：");
            System.out.println("Fuerza: " + adjuster.getFuerza());
            System.out.println("Inteligencia: " + adjuster.getInteligencia());
            System.out.println("abiduria: " + adjuster.getSabiduria());

            // 关闭扫描器 close scanner
            scanner.close();
        }
}


