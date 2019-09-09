package com.liguangzong.testUtils;

import org.junit.Test;

import com.liguangzong.utils.StringUtils;

public class TestDemo {
			//���Ը�����ǩ
			@Test
			public void testHtml(){
				String text = "addddasdas";
				String html = StringUtils.toHtml(text);
				System.out.println(html);
			}
			@Test
			//�����Ƿ�Ϊ�ֻ���
			public void isPhone(){
				String text = "13061235962";
				boolean phone = StringUtils.isPhone(text);
				System.out.println(phone);
			}
			@Test
			//�����Ƿ�Ϊ�����
			public void isEmail(){
				String text = "2505032677@qq.com";
				boolean email = StringUtils.isEmail(text);
				System.out.println(email);
			}
			
		
}
