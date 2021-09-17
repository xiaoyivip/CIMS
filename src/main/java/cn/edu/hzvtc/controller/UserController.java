package cn.edu.hzvtc.controller;

import cn.edu.hzvtc.pojo.Area;
import cn.edu.hzvtc.pojo.ReturnMsg;
import cn.edu.hzvtc.pojo.User;
import cn.edu.hzvtc.service.AreaService;
import cn.edu.hzvtc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private AreaService areaService;


    /**
     * 登录
     */
    @RequestMapping("/login")
    @ResponseBody
    public ReturnMsg login(@RequestParam(value = "userName", required = true) String userName,
                           @RequestParam(value = "userPassword", required = true) String userPassword,
                           HttpSession session) {

        System.out.println("加密前的密码:"+userPassword);
        //用户名密码为空，登录失败，返回登录页
        if (userName == null || userPassword == null) {
            return ReturnMsg.fail();
        }
//        String pwd = DigestUtils.md5DigestAsHex(userPassword.getBytes());
       // System.out.println("加密后的密码:"+pwd);
        //从数据库中获取用户名和密码后进行判断
        User loginUser = userService.login(userName, userPassword);

        if(loginUser != null){
            session.setAttribute("loginUser", loginUser);
            System.out.println(session.getId());
            ReturnMsg returnMsg = ReturnMsg.success();
            if (loginUser.getUserType() == 1) {
                returnMsg.setTarget("area/areaIndex");
            } else if (loginUser.getUserType() == 2) {
                returnMsg.setTarget("unit/unitIndex");
            } else if (loginUser.getUserType() == 3) {
                returnMsg.setTarget("msg/msgIndex");
            } else {
                returnMsg.setTarget("");
            }
            return returnMsg;
        }else{
            /*密码错误*/
            return ReturnMsg.fail().add("fieldErrors", "密码错误");
        }

        //登录成功
//        if (loginUser != null) {
//            if (loginUser.getUserPassword().equals(pwd)) {
//                session.setAttribute("loginUser", loginUser);
//                System.out.println(session.getId());
//
//                ReturnMsg returnMsg = ReturnMsg.success();
//                if (loginUser.getUserType() == 1) {
//                    returnMsg.setTarget("area/areaIndex");
//                } else if (loginUser.getUserType() == 2) {
//                    returnMsg.setTarget("unit/unitIndex");
//                } else if (loginUser.getUserType() == 3) {
//                    returnMsg.setTarget("msg/msgIndex");
//                } else {
//                    returnMsg.setTarget("");
//                }
//                return returnMsg;
//            } else {
//                /*密码错误*/
//                return ReturnMsg.fail().add("fieldErrors", "密码错误");
//            }
//        } else {
//            /*用户不存在*/
//            return ReturnMsg.fail().add("fieldErrors", "用户不存在");
//        }
    }

    /**
     * 获取登录用户信息
     */
    @RequestMapping("/loginUser")
    @ResponseBody
    public ReturnMsg loginUser(HttpSession session) {
        User loginUser = (User) session.getAttribute("loginUser");
        System.out.println("****************" + session.getId() + "********" + loginUser.toString());

        /*添加所有地区*/
        Area area = loginUser.getArea();
        String areaAll = "";
        if (area != null) {
            do {
                System.out.println(area.getAreaName());
                areaAll = area.getAreaName() + " " + areaAll;
                area = area.getParentArea();
            } while (area != null);
            /*清除最后一个空格*/
            areaAll = areaAll.substring(0, areaAll.length() - 1);
        }

        return ReturnMsg.success().add("loginUser", loginUser).add("areaAll", areaAll);
    }

    /**
     * 注销
     */
    @RequestMapping("/logout")
    @ResponseBody
    public ReturnMsg logout(HttpSession session) {
        /*清楚session*/
        session.invalidate();
        /*重定向到登录页面的跳转方法*/
        ReturnMsg returnMsg = ReturnMsg.success();
        returnMsg.setTarget("../");
        return returnMsg;
    }
}