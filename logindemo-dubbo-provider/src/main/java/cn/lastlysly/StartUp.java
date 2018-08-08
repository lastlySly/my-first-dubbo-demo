package cn.lastlysly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-08-07 19:40
 **/
public class StartUp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("spring/spring-dao.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames){
            System.out.println("遍历bean:"+beanName);
        }
        System.out.println("服务发布成功");
        context.start();
        System.in.read();
    }
}
