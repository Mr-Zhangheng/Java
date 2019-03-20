package com.qianfeng.week3.day3.fStringBuffer;

public class StringBufferDemo {
	public static void main(String[] args) {
		// StringBuffer��StringBuilder��
		// ���췽����
		// 0. ͨ��һ���ַ�����ʵ����һ��StringBuffer
		StringBuffer buffer = new StringBuffer("hello world");
		
		// 1. append: �ַ���ƴ�ӣ���һ��ָ���Ĳ���ƴ�ӵ��ַ����Ľ�β
		// 2. insert: �ַ������룬��ָ���Ĳ��ֲ��뵽һ���ַ�����ָ����λ��
		// 3. delete: �ַ���ɾ����ɾ��ָ�����ֵ��Ӵ�
		// 4. deleteCharAt: ɾ��ָ���±���ַ�
		// 5. replace: �ַ����滻��ʹ��һ���µ��ַ������滻��ԭ�ַ�����ָ����Χ���ַ���
		// 6. reverse: �ַ�����ת
		// 7. setCharAt: �޸�ָ��λ���ַ�Ϊһ���µ��ַ�
		// 8. toString: ��StringBufferת���ַ���
		
		buffer.append('!').append("2").append("123");
		buffer.append("xiaoming", 2, 4);
		
		buffer.insert(11, '@');
		buffer.delete(11, 13);
		buffer.deleteCharAt(12);
		buffer.replace(6, 11, "WORLLD");
		buffer.reverse();
		buffer.setCharAt(4, '!');
		
		System.out.println(buffer);
		
	}
}
