package com.zjs.controller;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zjs.model.User;
import com.zjs.model.UserLoginLog;
import com.zjs.service.UserLoginService;
import com.zjs.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	private UserLoginService userLoginService;

	
	/**
	 * 注册功能
	 * @param user
	 * @return
	 */
	@RequestMapping("/registerUser.do")
	public String registerUser(User user) {

		return "addUser";
	}
	
	@RequestMapping("/addUser.do")
	public String addUser(User user) {
		user.setPassword(MD5Encode(user.getPassword(), "utf-8"));
		userService.addUser(user);
		return "login";
	}
	
	/**
	 * 登录功能
	 * @param user
	 * @param userloginlog
	 * @param model
	 * @return
	 */
	@RequestMapping("/loginUser.do")
	public String login(User user,UserLoginLog userloginlog,Model model){
		System.out.println(user.getCellphone());
		System.out.println(user.getPassword());
		MD5Encode(user.getPassword(), "utf-8");
		System.out.println(MD5Encode(user.getPassword(), "utf-8"));
		User loginUser = userService.loginUser(user);
		if(loginUser != null){
			System.out.println(userloginlog.getLogin_time());
//			userloginlog.setUser_id(user.getUser_id());
//			System.out.println(user.getUser_id());
//			userLoginService.addUserLoginLog(userloginlog);

			
			return "success";
		}
		
		return  "login";
		
	}
	
	
	
	
	/**
	 * 进行MD5的加密方法
	 * @param b
	 * @return
	 */
	private static String byteArrayToHexString(byte b[]) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++)
			resultSb.append(byteToHexString(b[i]));
	 
		return resultSb.toString();
	}
	 
	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n += 256;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}
	 
	public static String MD5Encode(String origin, String charsetname) {
		String resultString = null;
		try {
			resultString = new String(origin);
			MessageDigest md = MessageDigest.getInstance("MD5");
			if (charsetname == null || "".equals(charsetname))
				resultString = byteArrayToHexString(md.digest(resultString
							.getBytes()));
			else
				resultString = byteArrayToHexString(md.digest(resultString
							.getBytes(charsetname)));
		} catch (Exception exception) {
		}
		return resultString;
	}
	private static final String hexDigits[] = { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
}
