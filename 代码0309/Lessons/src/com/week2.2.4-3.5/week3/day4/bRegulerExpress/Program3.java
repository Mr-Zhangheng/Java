package com.qianfeng.week3.day4.bRegulerExpress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program3 {
	public static void main(String[] args) {
		// ��Java�в���������Ҫʹ�õ����ࣺ
		// Pattern��Mather
		// Pattern:
		// ��̬����
		Pattern.matches("^hello world$", "hello world");
		
		
		// ��ȡһ��Pattern����
		// ����ʵ������ͨ�������������ȡ����
		// ������ ����һ��������ʽ
		Pattern pattern = Pattern.compile("\\d+");
		
		Matcher m = pattern.matcher("aa1123456765678asdfghjk");
		
		// ��ȡһ��Pattern����
		System.out.println(m.pattern());				// pattern
		// boolean���͵ģ���ȡһ��ƥ��Ľ��
		System.out.println(m.matches());				// true
		
		// ��ǰ����ַ�������ƥ�䣬 ֻ�е��������������ַ������ֵ�ǰ����ʱ��Ż�����
		// У��һ���ַ����Ƿ�����ָ���Ĺ�����Ϊ��ͷ�ġ�
		System.out.println(m.lookingAt());
		
		// ��һ���ַ���������Ĳ�λ����ƥ�䣬ֻҪ�����������Ĳ��֣��ͷ���true
		// ������String   contains
		// �ж�һ���ַ������Ƿ����������Ĳ��ֳ��֣���ͷ���⣩
		System.out.println(m.find());
		
		// ����һ���ַ��������������Ĳ��ֵ�һ���ַ����±�
		System.out.println(m.start());
		// ����һ���ַ��������������Ĳ������һ���ַ����±�
		System.out.println(m.end());
		
		
		Matcher matcher = Pattern.compile("^(1[3578]\\d)(\\d{4})(\\d{4})$").matcher("13577665544");
		// ���ҷ���
		matcher.find();
		System.out.println(matcher.group(1));
		System.out.println(matcher.group(2));
		System.out.println(matcher.group(3));
		
		
	}
}
