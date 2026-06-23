public class Main {

    public static void main(String[] args) {

        Termometro termometro = new Termometro();

        System.out.println("Temperatura inicial: "
                + termometro.getTemperatura() + "°C");

        // Valor válido
        termometro.setTemperatura(30.0);

        System.out.println("Temperatura atual: "
                + termometro.getTemperatura() + "°C");

        // Valor inválido
        termometro.setTemperatura(60.0);

        System.out.println("Temperatura final: "
                + termometro.getTemperatura() + "°C");
    }
}