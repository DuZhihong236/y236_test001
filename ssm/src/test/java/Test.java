import cn.bdqn.Mapper.IAccountMapper;
import cn.bdqn.Service.IAccountService;
import cn.bdqn.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.InputStream;
import java.util.List;

@ContextConfiguration(locations="classpath:beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {

    @org.junit.Test
    public void Test() throws Exception{
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = ssf.openSession();

        IAccountMapper accountMapper = session.getMapper(IAccountMapper.class);
        List<Account> accounts = accountMapper.selectAll();
        System.out.println(accounts);

        is.close();
        session.close();
    }



    @Autowired
    @Qualifier("accountServiceImpl")
    IAccountService accountService;

    @org.junit.Test
    public void testSpring() throws Exception{
        List<Account> accounts= accountService.queryAll();
        System.out.println(accounts);
    }
}
