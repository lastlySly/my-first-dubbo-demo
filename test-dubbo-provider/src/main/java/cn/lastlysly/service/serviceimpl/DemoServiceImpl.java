package cn.lastlysly.service.serviceimpl;

import cn.lastlysly.pojo.UserSheet;
import cn.lastlysly.service.DemoService;
import com.alibaba.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-08-02 20:30
 **/


//这里@Services使用dubbo提供的，不能用spring原本的，spring的只有以下1）的功能
    //1）把该类在Spring创建一个bean
    //2)把该bean以特定接口注册服务
@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        System.out.println("远程接收到数据：" + name);
        return "Hello " + name;
    }

    /**
     * 模拟测试对象远程服务，网络传输对象需要序列化，需要转化为二进制流来传输。
     * 对象测试
     * 网络传输对象需要序列化，需要转化为二进制流来传输。
     * UserSheet对象要实现序列化接口
     * @param userSheet
     * @return
     */
    public UserSheet testUserInfo(UserSheet userSheet) {
        System.out.println(userSheet.toString());
        userSheet.setUserAge(18);
        userSheet.setUserName("Kagari");
        return userSheet;
    }

    /**
     * 集合测试
     * @return
     */
    public List<UserSheet> listUserInfo() {
        List<UserSheet> userSheetList = new ArrayList<UserSheet>();
        for (int i = 0; i < 5; i++){
            UserSheet userSheet = new UserSheet();
            userSheet.setUserId(i);
            userSheet.setUserName("Natsugi");
            userSheet.setUserAge(18);
            userSheetList.add(userSheet);
        }
        System.out.println("集合测试" + userSheetList.size());
        return userSheetList;
    }
}
