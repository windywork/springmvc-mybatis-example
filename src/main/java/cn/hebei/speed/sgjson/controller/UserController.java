package cn.hebei.speed.sgjson.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hebei.speed.sgjson.dao.UserDao;
import cn.hebei.speed.sgjson.model.User;

@Controller
public class UserController {
	private static Logger logger = LogManager.getLogger(UserController.class
			.getName());
	
	@Autowired
	public UserDao userDao = null;
	
	
	@ResponseBody  
    @RequestMapping("/login.json")  
    public User login() {  
		logger.debug("用户登录");
		User u=userDao.findUserById(1L);
        return u;  
    }  
	
	
}
