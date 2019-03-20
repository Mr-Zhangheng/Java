package com.qianfeng.week3.day4.bRegulerExpress;

public class Program1 {
	public static void main(String[] args) {
		// �ж�һ���ַ����Ƿ��ָ�����������ƥ��
		// boolean ret = "hello world".matches("hello world");
		// System.out.println(ret);
		
		// ^: ����ƥ��һ���ַ����Ŀ�ͷ
		System.out.println("hello world".matches("^hello world"));
		// $������ƥ��һ���ַ����Ľ�β
		System.out.println("hello world".matches("hello world$"));
		// �����Ҫ��һ���ַ�������������У��, ��ð�^��$������ȥ��
		System.out.println("hello world".matches("^hello world$"));
		
		// []: ��ʾ����ƥ��һλ�ַ�
		// [abc]: ��ʾ��һλ�ַ�������a��Ҳ������b��Ҳ������c
		System.out.println("aello world".matches("^[abch]ello world$"));
		// [a-z]: ��ʾ��һλ�ַ����������е�Сд��ĸ [a, z]
		System.out.println("aello world".matches("^[a-z]ello world$"));
		// [a-zABC]: ��ʾ��һλ�ַ����������е�Сд��ĸ������A������B������C
		System.out.println("Bello world".matches("^[a-zABC]ello world$"));
		// [a-zA-Z]: ��ʾ��һλ�ַ����������еĴ�Сд��ĸ
		System.out.println("hello world".matches("^[a-zA-Z]ello world$"));
		// [a-zA-Z0-9]: ��ʾ��һλ�ַ����������еĴ�Сд��ĸ��������
		System.out.println("hello world".matches("^$[a-zA-Z0-9]ello world"));
		// [^a]: ��ʾ��һλ�ַ�������������ַ���Ψ������a
		System.out.println("aello world".matches("^[^a]ello world$"));
		// [^abc]: ��ʾ��һλ�ǳ���a��b��c֮��������ַ�
		System.out.println("cello world".matches("^[^abc]ello world$"));
		// [^a-z[h-w]]: 
		System.out.println("uello world".matches("^[^a-z[h-w]]ello world$"));
		
		// .: ��һ��ͨ���������ƥ��������ַ�
		System.out.println("hello world".matches("^.ello world$"));
		
		// \: ��һ��ת���ַ�����ע����Ϊ����������ַ�����Ҳ��һ��ת���ַ�������������Ҫ�ټ�һ��ת��
		System.out.println("hello world".matches("^hello\\.world$"));
		
		// \d: [0-9] ����ƥ�����������
		// \D: [^0-9] ����ƥ������ķ�����
		System.out.println("hello world1".matches("^hello world\\d$"));
		
		// \w: ����ƥ�������һ�������ַ� [a-zA-Z0-9_]
		// \W: ����ƥ�������һ���ǵ����ַ� 
		
		// + : ǰ���һλ����һ���ַ�����������1�λ���
		// ? : ǰ���һλ����һ���ַ�����������1�λ�0��
		// * : ǰ���һλ����һ���ַ�����������0�λ���(����1��)
		System.out.println("hello world".matches("^hel+o world$"));
		System.out.println("hello world".matches("^hell?o world$"));
		System.out.println("helo world".matches("^hel*o world$"));
		System.out.println("hello world".matches(".*"));
		
		// {}: ��������
		// {m}		:ǰ���һλ����һ���ַ�������������m��
		// {m,}		:ǰ���һλ����һ���ַ�����������������m��	
		// {m,n}	:ǰ���һλ����һ���ַ�����������������m�Σ����n��
		
		System.out.println("hello world".matches("^hel{2,5}o world$"));
		
		
		// (): ���飬���Խ�һ���ַ�������ָ���Ĺ�����з���
	}
}
