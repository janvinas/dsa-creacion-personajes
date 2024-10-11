public class AtaquePersonaje {

    private int[] attackRollValues;
    private int GACO;

    // Constructor que inicializa un personaje de nivel 1 y establece el GACO en 19
    public AtaquePersonaje() {
        this.GACO = 19;
        this.attackRollValues = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}; // 从10到19的掷骰值

    }

    // Devuelve el impacto CA correspondiente basado en el valor de la tirada de dados de ataque
    public int getImpactOnAC(int attackRoll) {

        if (attackRoll >= 10 && attackRoll <= 19) {
            return attackRollValues[attackRoll - 10];
        } else {
            throw new IllegalArgumentException("La tirada del dado de ataque debe estar entre 10 y 19.");
        }
    }

    public int getGACO() {
        return GACO;
    }

    public void setGACO(int GACO) {
        this.GACO = GACO;
    }
}
