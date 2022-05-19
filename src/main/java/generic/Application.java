package generic;

public class Application {
    public static void main(String[] args) {
        MapperSample mapperSample = new MapperSample();
        String test1 = "1234";
        mapperSample.getToInteger(test1);
        mapperSample.getToString(test1);

    }
}
