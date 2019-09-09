package com.liguangzong.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
			//�ж����������Ƿ�Ϊ��
			public static boolean isKong(String text){
				if (text.isEmpty()&&text.length()>0&&text.trim().length()>0) {
					return true;
				}
				return false;
			}
			//�滻��\r\n���Լ�"\r"
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
			//��֤�Ƿ�Ϊ�й������ֻ�����
			public static boolean isPhone(String text){
				//���зǿ��ж�
				boolean kong = StringUtils.isKong(text);
				//�����Ϊ������������ж�
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
			//��֤�Ƿ�Ϊ����
			public static boolean isEmail(String text){
				//���зǿ��ж�
				boolean kong = StringUtils.isKong(text);
				//�����Ϊ������������ж�
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
