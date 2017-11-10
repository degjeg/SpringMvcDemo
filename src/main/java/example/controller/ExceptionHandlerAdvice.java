package example.controller;

import example.models.BaseResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

/**
 * Created by Administrator on 2017-11-09.
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseResponse exception(Exception e, WebRequest request) {
        BaseResponse r = new BaseResponse();
        r.setRetCode(-11);
        r.setMessage(e.getMessage()
                + "\n" + request.getContextPath()
                + "\n" + request.getContextPath()
        );


        return r;
    }
}
