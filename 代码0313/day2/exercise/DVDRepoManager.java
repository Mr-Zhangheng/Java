package com.qianfeng.week4.day2.exercise;

public class DVDRepoManager {
	/**
	 * ֱ�Ӻ��û��򽻵��ġ�
	 * ��
	 * ɾ
	 * ��
	 * 
	 * ��
	 * ��
	 */
	
	/**
	 * ��ֿ������һ��DVD
	 * @param name
	 * @return �Ƿ���ӳɹ�
	 */
	public boolean add(String name) {
		// 1. ��ʼ��һ���µ�DVD
		DVD dvd = new DVD(name);
		// 2. ��ӵ��ֿ�
		return DVDRepo.getInstance().add(dvd);
	}
	
	/**
	 * �Ӳֿ���ɾ��һ��DVD
	 * @param name
	 * @return
	 */
	public boolean remove(String name) {
		return DVDRepo.getInstance().remove(name);
	}
	
	/**
	 * ��ȡ�ֿ������е�DVD��Ϣ
	 * @return
	 */
	public DVD[] getAll(Query query) {
		return DVDRepo.getInstance().getAll(query);
	}
	
	/**
	 * ��DVD
	 * @param name
	 * @return
	 */
	public OperationStatus borrow(String name) {
		// 1. ͨ��������֣��ҵ�ָ����DVD
		DVD dvd = DVDRepo.getInstance().getDVD(name);
		
		// 2. �ж����DVD�Ƿ����
		if (dvd == null) {
			// ˵�����DVD������
			return OperationStatus.NotFound;
		}
		
		// 3. ���Խ����DVD
		boolean ret = dvd.borrow();
		
		if (ret) {
			// ˵����ɹ���
			return OperationStatus.Success;
		}
		else {
			// ˵����ʧ����
			return OperationStatus.StatusError;
		}
	}
	
	/**
	 * ��
	 * @param name
	 * @return
	 */
	public OperationStatus send(String name) {
		// 1. ͨ��������֣��ҵ�ָ����DVD
		DVD dvd = DVDRepo.getInstance().getDVD(name);

		// 2. �ж����DVD�Ƿ����
		if (dvd == null) {
			// ˵�����DVD������
			return OperationStatus.NotFound;
		}

		// 3. ���Ի����DVD
		boolean ret = dvd.send();

		if (ret) {
			// ˵�����ɹ���
			return OperationStatus.Success;
		} else {
			// ˵����ʧ����
			return OperationStatus.StatusError;
		}
	}
	
	
}









