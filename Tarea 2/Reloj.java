import java.time.LocalTime;
public class Reloj extends Thread{
    public void run(){
        while (true) {
            
            LocalTime now = LocalTime.now();
            System.out.println("La hora actual es: " + now.toString() + "\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}
