package tk.mybatis.springboot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tk.mybatis.springboot.model.Country;

/**
 * Created by jmx on 16/10/20.
 */
@Controller
public class TestController {
    @RequestMapping(value = "/add")
    public String add() {

        return "index";
    }
}
