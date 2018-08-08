package cn.lastlysly.controller;

import cn.lastlysly.myutils.MyResult;
import cn.lastlysly.pojo.AccountSheet;
import cn.lastlysly.service.UserinfoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-08-08 09:53
 **/
@Controller
public class HelloController {

    @Reference
    private UserinfoService userinfoService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(){
        return "测试Hello dubbo";
    }

    /**
     * 获取账户信息
     * @return
     */
    @RequestMapping(value = "/listaccount")
    @ResponseBody
    public MyResult listAccount(){
        List<AccountSheet> accountSheetList  = userinfoService.selectAccountInfo();
        return new MyResult(1,"消费者获取数据成功",accountSheetList);
    }

    /**
     * 转账
     * @return
     */
    @RequestMapping(value = "/transfer")
    @ResponseBody
    public MyResult transferAccount(HttpServletRequest request){
        int inId = Integer.parseInt(request.getParameter("accountIn"));
        int outId = Integer.parseInt(request.getParameter("accountOut"));
        double money = Double.parseDouble(request.getParameter("money"));
        if (userinfoService.updateTransferAccount(money,outId,inId)){
            return new MyResult(1,"转账成功",null);
        }
        return new MyResult(0,"转账失败，事务回滚",null);

    }

}
