package cn.lastlysly.handler;

import cn.lastlysly.myutils.MyResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-08-08 10:40
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public MyResult customExceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception e){
        return new MyResult(0,"这里是全局异常处理：" + e.getMessage(),null);
    }


}
