import java.util.ArrayList;

public class main {
    static ArrayList<Arma> armas;
    public static void main(String[] args) {
        Pistola pistola = new Pistola();
        Arma fusil = new Fusil();

        armas = new ArrayList<>();
        armas.add(pistola);
        armas.add(fusil);
    }
}
