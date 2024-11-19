package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
	public class Account {
		private long accountno;
		private String name;
		private long mobno;
		private long aadharno;
		private String gender;
		private int age;
		private List<String> langauge;
		private String city;
		private double balance;
		private String password;
		
		public long getAccountno() {
			return accountno;
		}
		public void setAccountno(long accountno) {
			this.accountno = accountno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getMobno() {
			return mobno;
		}
		public void setMobno(long mobno) {
			this.mobno = mobno;
		}
		public long getAadharno() {
			return aadharno;
		}
		public void setAadharno(long aadharno) {
			this.aadharno = aadharno;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
		public List<String> getLangauge() {
			return langauge;
		}
		public void setLangauge(List<String> langauge) {
			this.langauge = langauge;
		}
		
		
		
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Account [accountno=" + accountno + ", name=" + name + ", mobno=" + mobno + ", aadharno=" + aadharno
					+ ", gender=" + gender + ", age=" + age + ", langauge=" + langauge + ", city=" + city + ", balance="
					+ balance + ", password=" + password + "]";
		}
		
		 
		
	
}
