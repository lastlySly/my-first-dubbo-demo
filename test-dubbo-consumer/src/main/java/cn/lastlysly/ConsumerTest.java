package cn.lastlysly;

import cn.lastlysly.pojo.UserSheet;
import cn.lastlysly.service.DemoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-08-06 10:48
 * 测试方式启动
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:consumer.xml")
public class ConsumerTest {

//    @Autowired
    @Reference //创建接口本地代理对象，并且纳入spring管理，并且注入进来
    private DemoService demoService;

    /**
     * 入门，字符串测试
     */
    @Test
    public void test(){
        System.out.println(demoService.sayHello("lastlysly"));
    }

    /**
     * 对象测试
     * 网络传输对象需要序列化，需要转化为二进制流来传输。
     * UserSheet对象要实现序列化接口
     */
    @Test
    public void testDemo(){
        UserSheet userSheet = new UserSheet();
        userSheet.setUserId(1);
        UserSheet resUser = demoService.testUserInfo(userSheet);
        System.out.println(resUser.toString());
    }

    /**
     * 集合测试
     */
    @Test
    public void testListDemo(){
        List<UserSheet> userSheetList = demoService.listUserInfo();
        for (int i = 0; i < userSheetList.size(); i++){
            System.out.println(userSheetList.get(i).toString());
        }
    }
}
