import com.jabo.pojo.Books;
import com.jabo.service.impl.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bean = applicationContext.getBean(BookServiceImpl.class);

        for (Books books : bean.queryAllBook()) {
            System.out.println(books);
        }
    }
}
