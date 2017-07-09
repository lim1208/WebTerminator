package edu.scut.ibm.controller;

import edu.scut.ibm.dao.SpittleDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by limin on 2017/7/8.
 */
@Controller
@RequestMapping("/spittle")
public class SpittleController {
    private SpittleDao spittleDao;

    @RequestMapping(method = RequestMethod.GET)
    public String spittle(Model model){
        model.addAttribute("spittles", spittleDao.findSpittles(Long.MAX_VALUE, 20));
        return "spittles";
    }
}
