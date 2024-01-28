package jpabook.jpashop2.controller;

import jpabook.jpashop2.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@Slf4j
public class HoneController {

    @RequestMapping("/")
    public String home(){
        log.info("home controller");
        return "home";
    }

    @GetMapping("/")
    public String homeLogin(@SessionAttribute(name = "SessionConst.LOGIN_MEMBER", required = false)Member member, Model model) {
        if(member == null) {
            model.addAttribute("loginForm", new LoginForm());
            return "members/loginForm";
        }

        model.addAttribute("member", member);
        return "home";

    }
}
