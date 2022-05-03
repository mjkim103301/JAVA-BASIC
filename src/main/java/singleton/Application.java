package singleton;


public class Application {
    public static void main(String[] args) {
        CalcService calcService = new CalcService();
        calcService.syncCalcRun();
        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println("===================================");
        calcService.noSyncCalcRun();
    }
}
