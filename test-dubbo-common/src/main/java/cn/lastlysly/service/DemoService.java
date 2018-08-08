package cn.lastlysly.service;

import cn.lastlysly.pojo.UserSheet;

import java.util.List;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-08-06 09:56
 **/
public interface DemoService {
    /**
     * 入门
     * @param name
     * @return
     */
    String sayHello(String name);

    /**
     * 对象测试
     * 网络传输对象需要序列化，需要转化为二进制流来传输。
     * UserSheet对象要实现序列化接口
     * @param userSheet
     * @return
     */
    UserSheet testUserInfo(UserSheet userSheet);

    /**
     * 集合测试
     * @return
     */
    List<UserSheet> listUserInfo();
}
