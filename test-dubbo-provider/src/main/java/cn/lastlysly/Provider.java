package cn.lastlysly;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-08-02 20:35
 * 服务提供者
 **/
public class Provider {
    public static void main(String[] args) throws Exception {

        //初始化spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
//        //查看spring里有哪些bean
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        System.out.println("查看spring里有哪些bean。");
//        for(String name : beanDefinitionNames){
//            System.out.println(name);
//        }


        context.start();
        System.out.println("服务注册成功");
        //阻塞线程，不让程序结束
        System.in.read(); // 按任意键退出
    }
}
