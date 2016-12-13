package com.thymeleaf.controller.api.login;

import com.thymeleaf.vo.login.LoginVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Created by lw on 16-12-12.
 */
@RestController
@RequestMapping("/api/login")
public class LoginMgrController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public String login(LoginVo login) {
//        System.out.println(login.getName() + "  " + login.getPassword());
        return login.getName() + "  " + login.getPassword();
    }
}
