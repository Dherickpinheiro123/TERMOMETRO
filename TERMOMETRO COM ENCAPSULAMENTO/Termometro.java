public class Termometro {

    private double temperatura;

    // Construtor padrão
    public Termometro() {
        this.temperatura = 20.0;
    }

    // Getter
    public double getTemperatura() {
        return temperatura;
    }

    // Setter com validação
    public void setTemperatura(double temperatura) {

        if (temperatura >= -10.0 && temperatura <= 50.0) {
            this.temperatura = temperatura;
            System.out.println("Temperatura alterada para: " + temperatura + "°C");
        } else {
            System.out.println("ERRO: Temperatura fora do limite permitido!");
        }
    }
}
