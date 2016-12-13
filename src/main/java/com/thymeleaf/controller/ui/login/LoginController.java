package com.thymeleaf.controller.ui.login;

import com.thymeleaf.vo.login.LoginVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * Created by lw on 16-12-12.
 */
@Controller
@RequestMapping("login")
public class LoginController {
    @RequestMapping("")
    public String login(Model model) {
        model.addAttribute("info", "info");
        return "login/login";
    }

    @RequestMapping(value = "/auth")
    public String login(LoginVo login, Model model) {
        System.out.println(login.getName() + "  " + login.getPassword());
        String info = "login id： `" + login.getName() + ": " + login.getPassword();
        model.addAttribute("info", info);
        return "login/login";
    }
}
