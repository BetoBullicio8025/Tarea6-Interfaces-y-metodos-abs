import herenciaMultiple.alumnoDeportistaArtista;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.setLado(5);
        System.out.println("El area es: " + cuadrado1.calcularArea());

        Circulo circulo1 = new Circulo();
        circulo1.setRadio(2.4);
        System.out.println("El area del circulo es: " + circulo1.calcularArea());
        alumnoDeportistaArtista aDA = new alumnoDeportistaArtista();
        aDA.setArte("Pintura");
        aDA.setDeporte("Futbol");
        aDA.setPromedio(9);
        System.out.println(aDA.ensayar(""));
        System.out.println(aDA.entrenar());
        System.out.println(aDA.presentarObra());
        System.out.println(aDA.presentarCompetencia("En estadio olimpico"));

    }

}
