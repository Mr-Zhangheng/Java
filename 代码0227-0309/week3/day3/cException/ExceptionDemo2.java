package com.qianfeng.week3.day3.cException;

import java.util.Random;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		// ��try-catch-finally���Ļ���ʹ�á�
		
		try {
			Random random = new Random();
			int c = 10 / random.nextInt(3);
			System.out.println(c);
			
			
			int[] array = new int[5];
			array[5] = 10;
			
			System.out.println("���鸳ֵ���");
		}
		
		/*
		 * 1. �����е��쳣���зֱ�Ĵ���
		 */
		/*
		catch(ArithmeticException e) {
			System.out.println("��Ȼ������仰�ˣ�˵��try�еĴ������ArithmeticException�쳣�ˡ�");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("��Ȼ������仰�ˣ�˵��try�еĴ������ArrayIndexOutOfBoundsException�쳣�ˡ�");
		}
		*/
		
		
		/*
		 * 2. ��ĳһЩ�쳣������ͬ�Ĵ���
		 */
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("��Ȼ������仰�ˣ�˵��try�еĴ���������������±�Խ���쳣��");
			
			System.out.println("toString: " + e.toString());
			System.out.println("getMessage: " + e.getMessage());
			// ����쳣��Ϣ���쳣��Ϣ�������δ�����쳣��������������һ����
			// ���Ǵ�ʱ��������ֹ����
			e.printStackTrace();	
		}
		
		/*
		 * 3. �����е��쳣����ͬ�Ĵ���
		catch (RuntimeException e) {
			System.out.println("��Ȼ������仰�ˣ�˵��try�еĴ���������쳣");
		}
		*/
		
		System.out.println("��������ֹͣ��");
	}
}
