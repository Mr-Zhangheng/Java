package com.qianfeng.week2.day4.cDuotai.example;

public class Program {
	// һ���µĶ���԰���ţ�������Ϊ����԰����Ա����Ҫ������԰�еĶ�����Ϣ¼��ϵͳ��
	// Ҫ�Ǽǵ���Ϣ����������֡�����
	// �������������ϻ�����Ҫ�ٵǼ�һ���Ա�
	public static void main(String[] args) {
		
		ZooManager zoo = new ZooManager();
		
		// ʵ�θ��βθ�ֵ
		// Animal animal = new Monkey(); 
		zoo.recordInfo(new Monkey());
		zoo.recordInfo(new Elephent());
	}
}
