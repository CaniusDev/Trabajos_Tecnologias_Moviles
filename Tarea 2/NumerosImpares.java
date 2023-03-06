public class NumerosImpares extends Thread{
     
     public void run() {
        for (int i = 1; i <= 19; i += 2) {
            
            System.out.println("Numero impar: ["+i + "]\n");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
     }
}
