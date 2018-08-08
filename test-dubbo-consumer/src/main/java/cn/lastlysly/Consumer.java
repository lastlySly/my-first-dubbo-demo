package cn.lastlysly;

import cn.lastlysly.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-08-02 20:44
 * 服务消费者
 * 普通启动
 **/
public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("java"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果

    }
}
