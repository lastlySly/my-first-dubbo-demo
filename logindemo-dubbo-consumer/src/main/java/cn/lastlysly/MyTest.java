package cn.lastlysly;

import cn.lastlysly.pojo.AccountSheet;
import cn.lastlysly.service.UserinfoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-08-07 20:31
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dubbo-consumer.xml")
public class MyTest {

    @Reference
    private UserinfoService userinfoService;

    @Test
    public void listAccountInfo(){
        List<AccountSheet> accountSheetList = userinfoService.selectAccountInfo();
        for (AccountSheet accountSheet : accountSheetList){
            System.out.println(accountSheet.getAccountId() + " == " +
                    accountSheet.getAccountUsername() + " == " + accountSheet.getAccountMoney());
        }
    }
}
