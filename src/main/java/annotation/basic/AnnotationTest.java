package annotation.basic;

import java.lang.annotation.Annotation;

public class AnnotationTest {
    public static void main(String[] args) {
        CustomAnnotation annotation = new CustomAnnotation() {
            @Override
            public Class<? extends Annotation> annotationType() {
                return null;
            }
        };
    }
}
