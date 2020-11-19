import com.djz.mapper.PersonMapper;
import com.djz.pojo.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author djz
 * @date 2020/11/18 -16:05
 */
public class MyTest {

    @Test
    public void test() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);

        SqlSession sqlSession = sessionFactory.openSession(true);
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        List<Person> persons = mapper.selectPerson();

        for (Person p : persons) {
            System.out.println(p);
        }

    }
}
