package jpabook.jpashop2.controller;

import jpabook.jpashop2.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class HomeController {

//    @RequestMapping("/")
//    public String home(){
//        log.info("home controller");
//        return "home";
//    }

    @GetMapping("/")
    public String homeLogin(@SessionAttribute(name = "login_member", required = false) Member member, Model model) {

        if(member != null) {
            log.info(member.getName());
            model.addAttribute("member", member);
        }
        return "home";

    }
}
