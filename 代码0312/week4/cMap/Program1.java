package com.qianfeng.week4.cMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program1 {
	public static void main(String[] args) {
		// ����HashMap����Map�ӿ��еķ���
		Map<String, String> map = new HashMap<>();
		
		// ����ɾ���ġ���
		map.put("name", "xiaoming");		// Key: name, Value: xiaoming
		map.put("age", "10");
		map.put("gender", null);
		map.put(null, null);
		
		map.put("name", "xiaobai");
		map.put(null, "hello world");
		
		// ͨ������ɾ��ָ���ļ�ֵ��
		map.remove("name");
		// ֻ�е�����ֵ��ƥ���ϣ��ſ���ɾ��
		map.remove("age", "12");
		// map.clear();
		
		// ͨ�������޸�ֵ
		map.replace("age", "20");
		// ֻ�е�����ֵ��ƥ���ϣ��Ž����޸�
		map.replace("age", "11", "10");
		
	
		// ��
		// ͨ��������ȡֵ
		System.out.println(map.get("age"));
		// ͨ��������ѯֵ������鲻��ֵ��˵�������ֵ�Բ�����!�������صڶ��������е�ֵ
		System.out.println(map.getOrDefault("name", "default name"));
		
		// ����
		// ��ȡ�����еļ���ɵ�һ��Set����
		Set<String> keys = map.keySet();
		
		for (String key : keys) {
			System.out.println(key + " = " + map.get(key));
		}
		
		// map.size();
		System.out.println(map.containsKey("age"));
		System.out.println(map.containsValue("20"));
		// ��ȡ�����е�ֵ��ɵļ���
		Collection<String> values = map.values();
		
		
		// ���ڼ��ϱ�����
		// entrySet: ��ȡ�����е�Entry��ɵ�һ������
		// Entry: ��Map�е�һ���ӿڣ���ʵ��������������map�����д洢�ļ�ֵ�Եġ�
		Set<Entry<String, String>> sets = map.entrySet();
		for (Entry<String, String> entry : sets) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
			// �����������ĳһ��ֵ��null, ��ĳ�"default"
			if (entry.getValue() == null) {
				entry.setValue("default");
			}
		}
		
	
		
		
		
		
		System.out.println(map);
		
	}
}
