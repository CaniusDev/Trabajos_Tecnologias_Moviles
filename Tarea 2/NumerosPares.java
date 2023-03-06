public class NumerosPares extends Thread{
    
    public void run(){
        for (int i = 0; i <= 20; i += 2) {
            
            System.out.println("Numero Par: ["+i + "]\n");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
