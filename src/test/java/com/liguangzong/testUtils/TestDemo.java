package com.liguangzong.testUtils;

import org.junit.Test;

import com.liguangzong.utils.StringUtils;

public class TestDemo {
			//测试更换标签
			@Test
			public void testHtml(){
				String text = "addddasdas";
				String html = StringUtils.toHtml(text);
				System.out.println(html);
			}
			@Test
			//测试是否为手机号
			public void isPhone(){
				String text = "13061235962";
				boolean phone = StringUtils.isPhone(text);
				System.out.println(phone);
			}
			@Test
			//测试是否为邮箱号
			public void isEmail(){
				String text = "2505032677@qq.com";
				boolean email = StringUtils.isEmail(text);
				System.out.println(email);
			}
			
		
}
