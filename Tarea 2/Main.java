public class Main {
    public static void main(String[] args) {
        Cancion cancion= new Cancion();
        NumerosPares numerosPares = new NumerosPares();
        NumerosImpares numerosImpares = new NumerosImpares();
        Reloj reloj = new Reloj();
        cancion.start();
        numerosPares.start();
        numerosImpares.start();
        reloj.start();
        
    }
}
