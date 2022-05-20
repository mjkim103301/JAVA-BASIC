package generic;

public class MapperSample {
    public <T> String getToString(T t) {
        String result=t.toString();
        System.out.println("변환된 타입: " + "String");
        return result;
    }

    public <T> int getToInteger(T t) {
        int result = 0;
        if (t instanceof String) {
            result = Integer.parseInt(t.toString());
        } else if (t instanceof Number) {
            result = ((Number) t).intValue();
        } else {
            System.out.println("변환 실패했습니다.");
        }
        System.out.println("변환된 타입: " + "int");
        return result;
    }


}
