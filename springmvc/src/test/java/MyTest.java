
import com.jabo.pojo.UserModel;
import com.jabo.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl bean = applicationContext.getBean(UserServiceImpl.class);

        for (UserModel books : bean.queryAllUser()) {
            System.out.println(books);
        }
    }
}
