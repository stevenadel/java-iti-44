package jets.day4.Annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationReflection {
    public static void main(String[] args) {
        Class<AnnotatedClass> annotatedClass = AnnotatedClass.class;

        // Extract class-level annotation
        Author classAuthorAnnotation = annotatedClass.getAnnotation(Author.class);
        printAuthorInfo("Class", classAuthorAnnotation);

        // Extract method-level annotation
        Method[] methods = annotatedClass.getDeclaredMethods();
        for (Method method : methods) {
            Author methodAuthorAnnotation = method.getAnnotation(Author.class);
            printAuthorInfo("Method " + method.getName(), methodAuthorAnnotation);
        }

        // Extract constructor-level annotation
        Constructor<?>[] constructors = annotatedClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            Author constructorAuthorAnnotation = constructor.getAnnotation(Author.class);
            printAuthorInfo("Constructor", constructorAuthorAnnotation);
        }

        // Extract field-level annotation
        Field[] fields = annotatedClass.getDeclaredFields();
        for (Field field : fields) {
            Author fieldAuthorAnnotation = field.getAnnotation(Author.class);
            printAuthorInfo("Field " + field.getName(), fieldAuthorAnnotation);
        }
    }

    private static void printAuthorInfo(String memberType, Author authorAnnotation) {
        if (authorAnnotation != null) {
            System.out.println(memberType + " Author: " + authorAnnotation.name() +
                    ", Date: " + authorAnnotation.date());
        } else {
            System.out.println(memberType + " is not annotated with @Author");
        }
    }
}

