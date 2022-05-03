package singleton;

public class MinusThread extends Thread{
    private Calculation calc;
    public MinusThread(Calculation calc){
        this.calc=calc;
    }
    public void run(){
        for(int i=0;i<1000;i++){
            calc.minus(1);
        }
    }
}
