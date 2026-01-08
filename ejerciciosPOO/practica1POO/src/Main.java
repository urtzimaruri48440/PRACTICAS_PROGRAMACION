public class Main {
    public static void main(String[] args) {

        circunferencia c1 = new circunferencia(7);
        System.out.println("Radio de la circunferencia: " + c1.getRadio());
        System.out.println("Área de la circunferencia: " + c1.calcularArea());
        System.out.println("Perímetro de la circunferencia: " + c1.calcularPerimetro());

        circunferencia c2 = new circunferencia(23.3);
        System.out.println("Radio de la circunferencia: " + c2.getRadio());
        System.out.println("Área de la circunferencia: " + c2.calcularArea());
        System.out.println("Perímetro de la circunferencia: " + c2.calcularPerimetro());

        esfera e1 = new esfera(3.7);
        System.out.println("Radio de la esfera: " + e1.getRadio());
        System.out.println("Volumen de la esfera: " + e1.calcularVolumen());

        esfera e2 = new esfera(6.8);
        System.out.println("Radio de la esfera: " + e2.getRadio());
        System.out.println("Volumen de la esfera: " + e2.calcularVolumen());


    }
}