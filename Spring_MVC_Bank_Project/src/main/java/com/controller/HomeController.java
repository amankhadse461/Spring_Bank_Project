package com.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.connections.MyConnections;
import com.model.Account;


@Controller
@ComponentScan(basePackages = "com")
public class HomeController {
	@Autowired
	public Account user;
	@Autowired
	public MyConnections myConnections;
	
	 List<Account> alist = new ArrayList<Account>();
	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/create")
	public String create() {
		return "register";
	}

//
	@RequestMapping("/register")
	public String register(@ModelAttribute("account") Account accountno) throws Exception {
		user.setAccountno(accountno.getAccountno());
		user.setAadharno(accountno.getAadharno());
		user.setMobno(accountno.getMobno());
		user.setAge(accountno.getAge());
		user.setGender(accountno.getGender());
		user.setName(accountno.getName());
		user.setPassword(accountno.getPassword());
		user.setBalance(10000);
		user.setLangauge(accountno.getLangauge());
		user.setCity(accountno.getCity());
		alist.add(accountno);
		System.out.println(user.getCity());
		for(String s : accountno.getLangauge())
		{
			System.out.println(s);
		}
		for(String s : user.getLangauge())
		{
			System.out.println(s);
		}
		System.out.println(user.getPassword());
		Connection con =myConnections.getConnections();
		String str = "insert into account values(?,?,?,?,?,?,?,?)";
		PreparedStatement pre = con.prepareStatement(str);
		pre.setLong(1, user.getAccountno());
		pre.setString(2, user.getName());
		pre.setLong(3, user.getMobno());
		pre.setLong(4, user.getAadharno());
		pre.setString(5, user.getGender());
		pre.setInt(6, user.getAge());
		pre.setDouble(7, user.getBalance());
		pre.setString(8, user.getPassword());
		pre.executeUpdate();
		return "login";
	}

	@RequestMapping("/userlogin")
	public String userLogin()
	{
		return"login";
	}
	@RequestMapping("/login")
	public String login(@ModelAttribute("account") Account account,Model model) {
		System.out.println(	user.getAccountno());
		System.out.println(user.getPassword());
		System.out.println(account.getAccountno());
		System.out.println(account.getPassword());
		for (Account account2 : alist) {
			if (account2.getAccountno() == account.getAccountno() && account2.getPassword().equals(account.getPassword())) {
				System.out.println("sucess");
				model.addAttribute("user",user);
				return "welcome";
		}
	}
		return "login";}
	
	@RequestMapping("/depositmoney")
	public String depositMoney()
	{
		return "deposit";
	}
	
	@RequestMapping("/deposit")
	public String deposit(@ModelAttribute("account") Account account, Model model) throws Exception
	{
		System.out.println("IntialBalance: "+user.getBalance());
		System.out.println("CurrentAccountno: "+account.getAccountno());
		System.out.println("IntialAccountno: "+user.getAccountno());
		if(user.getAccountno()==account.getAccountno()) {
			user.setBalance(user.getBalance()+account.getBalance());
			System.out.println("CurrentBalance: "+user.getBalance());
			String str = "update account set balance ='"+user.getBalance()+"'where accountno = '"+user.getAccountno()+"' ";
			Connection con = myConnections.getConnections();
			Statement stmt = con.createStatement();
			stmt.execute(str);
			model.addAttribute("user",user);
			return "welcome";
		}
		return "deposit";
	}
	
	@RequestMapping("/withdrawmoney")
	public String withdrawmoney()
	{
		return "withdraw";
	}
	
	@RequestMapping("/withdraw")
	public String withdraw(@ModelAttribute("account") Account account, Model model) throws Exception{
		System.out.println("IntialBalance1: "+user.getBalance());
		if(user.getAccountno()==account.getAccountno()) {
			user.setBalance(user.getBalance()- account.getBalance());
			System.out.println("CurrentBalance2: "+user.getBalance());
			System.out.println("CurrentBalance: "+user.getBalance());
			String str = "update account set balance ='"+user.getBalance()+"'where accountno = '"+user.getAccountno()+"' ";
			Connection con = myConnections.getConnections();
			Statement stmt = con.createStatement();
			stmt.execute(str);
			model.addAttribute("user",user);
			return "welcome";
		}
		return "withdraw";
	} 
	
	@RequestMapping("*")
	public String error() {
		return "error";
	}
}
