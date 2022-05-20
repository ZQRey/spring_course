package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Метод Main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        try {
            String bookname = uniLibrary.returnBook();
            System.out.println("В библиотеку вернули книгу " + bookname);
        } catch (Exception e){
            System.err.println("Книга не была возвращена!\nСообщение ошибки: " + e.getMessage());
        }
        context.close();
        System.out.println("Метод Main ends");
    }
}