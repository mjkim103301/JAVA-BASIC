package generic.test;

public class BoundTypeTest<T extends Number> {
    private T a;

    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public static void main(String[] args) {
        BoundTypeTest<Integer> integerBound = new BoundTypeTest<>();
        //integerBound.setA("Hello"); -> 컴파일 에러
        integerBound.setA(123);

        BoundTypeTest<Long> longBound = new BoundTypeTest<>();
        longBound.setA(123L);

        //BoundTypeTest<String> stringBound=new BoundTypeTest<>(); -> 컴파일 에러
    }
}
