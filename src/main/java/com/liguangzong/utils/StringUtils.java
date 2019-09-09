package com.liguangzong.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
			//判断输入内容是否为空
			public static boolean isKong(String text){
				if (text.isEmpty()&&text.length()>0&&text.trim().length()>0) {
					return true;
				}
				return false;
			}
			//替换“\r\n”以及"\r"
			public static String toHtml(String text){
				StringBuffer buffer = new StringBuffer();
				String[] split = text.split("(\r\n)");
				buffer.append("<html>");
				for (String string : split) {
					buffer.append("<p>");
					String replaceAll = string.replaceAll("\r", "<br>");
					buffer.append(replaceAll);
					buffer.append("</p>");
				}
				buffer.append("</html>");
				return buffer.toString();
			}
			//验证是否为中国地区手机号码
			public static boolean isPhone(String text){
				//进行非空判断
				boolean kong = StringUtils.isKong(text);
				//如果不为空则进行正则判断
				if (!kong) {
					
					Pattern pattern = Pattern.compile("(1[34]?[31]?[32]?[33]?)\\d{8}");
					Matcher matcher = pattern.matcher(text);
					if (matcher.matches()) {
						return true;
					}
					return false;
				}
				return false;
			}
			//验证是否为邮箱
			public static boolean isEmail(String text){
				//进行非空判断
				boolean kong = StringUtils.isKong(text);
				//如果不为空则进行正则判断
				if (!kong) {
					Pattern pattern = Pattern.compile("^([a-zA-Z0-9]+)@([a-zA-Z0-9]+)\\.([a-zA-Z]+)$");
					Matcher matcher = pattern.matcher(text);
					if (matcher.matches()) {
						return true;
					}
					return false;
				}
				return false;
			}
}
