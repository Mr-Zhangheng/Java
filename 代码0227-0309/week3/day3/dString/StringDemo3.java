package com.qianfeng.week3.day3.dString;

public class StringDemo3 {
	public static void main(String[] args) {
		String str = "hello world";
		
		// ��, �ַ���ƴ�ӣ��������ַ���ƴ�ӵ�һ��
		// str = str.concat("!");
		// System.out.println(str);
		
		// �ַ�����ȡ��
		// [beginIndex, endIndex)
		// str = str.substring(0, 5);
		// System.out.println(str);
		// ��ָ���±꿪ʼ����ȡ�����
		// str = str.substring(1);
		// System.out.println(str);	// 
		
		// ��ָ�����ַ��滻ԭ�ַ�����ָ�����ַ�
		// str = str.replace('l', 'L');
		// str = str.replace("ll", "Y");
		
		// str.charAt(0);
		// str.toCharArray();
		
		System.out.println(str.indexOf('l'));		// ��ѯָ�����ַ���һ�γ��ֵ��±�
		System.out.println(str.indexOf('l', 4));	// ��ѯָ�����ַ�����ָ��λ��ʼ����һ�γ��ֵ��±�
		System.out.println(str.lastIndexOf('l'));	// ��ѯָ�����ַ����һ�γ��ֵ��±�
		System.out.println(str.lastIndexOf('l', 4));// ��ѯָ�����ַ�����ָ��λ��ʼ�����һ�γ��ֵ��±�
		
		System.out.println(str.indexOf("ll"));			// ��ѯָ�����ַ�����һ�γ��ֵ��±�
		System.out.println(str.indexOf("ll", 4));		// ��ѯָ�����ַ�������ָ��λ��ʼ����һ�γ��ֵ��±�
		System.out.println(str.lastIndexOf("ll"));		// ��ѯָ�����ַ������һ�γ��ֵ��±�
		System.out.println(str.lastIndexOf("ll", 4));	// ��ѯָ�����ַ�������ָ��λ��ʼ�����һ�γ��ֵ��±�
		
		str = str.toUpperCase();	// ��Сд��ĸת�ɴ�д��ĸ
		str = str.toLowerCase();	// ����д��ĸת��Сд��ĸ
		
		System.out.println(str.isEmpty());		// �ж�һ���ַ����Ƿ��ǿմ� length() == 0
		System.out.println(str.length());		// ��ȡһ���ַ����ĳ���
		System.out.println(str.contains("ll"));	// �ж�һ���ַ������Ƿ����ָ�����Ӵ�
		
		System.out.println("��������֮�����.avi".startsWith("��������"));		// �ж�һ���ַ����Ƿ���ָ�����ַ�����ͷ
		System.out.println("��������֮�����.avi".endsWith(".avi"));				// �ж�һ���ַ����Ƿ���ָ�����ַ�����β
		
		str = "       hello world       ".trim();	// ȥ���ַ���ǰ��Ŀո��ַ�
		
		
		
		boolean ret = "hello world".equalsIgnoreCase("HELLO WORLD");	// �ж������ַ����Ƿ���ͬ�����Դ�Сд��
		
		/**
		 * �ж������ַ����Ĵ�С��ϵ
		 * ����ֵ��
		 * > 0: ǰ��ıȺ���Ĵ�
		 * ==0: ����һ����
		 * < 0: ����ı�ǰ��Ĵ�
		 * �ȽϹ���
		 * �ӵ�0���ַ���ʼ�����αȽ�ÿһ���ַ���ֱ��ĳһ���ַ��ıȽ��п������ִ�С��
		 * 
		 */
		System.out.println("---------------------------");
		System.out.println("hello world".compareTo("he"));
		System.out.println("---------------------------");
		
		// �Ƚ������ַ����Ĵ�С��ϵ�����Դ�Сд��
		"hello world".compareToIgnoreCase("HELLO WORLD");
		
		
		// String[] result = "xiaoming, laowang, lilei, hanmeimei, lily, lucy".split(", ");		// �и��ַ���
		
		String[] result = "xiaoming. lilei. hanmeimei. lily. lucy. uncle wang".split("\\. ");
		
		
		for(String ele : result) {
			System.out.println(ele);
		}
		
		System.out.println(str);
		
	}
}
