package com.qianfeng.week4.day2.exercise;

public class DVDRepoManager {
	/**
	 * 直接和用户打交道的。
	 * 增
	 * 删
	 * 查
	 * 
	 * 借
	 * 还
	 */
	
	/**
	 * 向仓库中添加一个DVD
	 * @param name
	 * @return 是否添加成功
	 */
	public boolean add(String name) {
		// 1. 初始化一个新的DVD
		DVD dvd = new DVD(name);
		// 2. 添加到仓库
		return DVDRepo.getInstance().add(dvd);
	}
	
	/**
	 * 从仓库中删除一个DVD
	 * @param name
	 * @return
	 */
	public boolean remove(String name) {
		return DVDRepo.getInstance().remove(name);
	}
	
	/**
	 * 获取仓库中所有的DVD信息
	 * @return
	 */
	public DVD[] getAll(Query query) {
		return DVDRepo.getInstance().getAll(query);
	}
	
	/**
	 * 借DVD
	 * @param name
	 * @return
	 */
	public OperationStatus borrow(String name) {
		// 1. 通过这个名字，找到指定的DVD
		DVD dvd = DVDRepo.getInstance().getDVD(name);
		
		// 2. 判断这个DVD是否存在
		if (dvd == null) {
			// 说明这个DVD不存在
			return OperationStatus.NotFound;
		}
		
		// 3. 尝试借这个DVD
		boolean ret = dvd.borrow();
		
		if (ret) {
			// 说明借成功了
			return OperationStatus.Success;
		}
		else {
			// 说明借失败了
			return OperationStatus.StatusError;
		}
	}
	
	/**
	 * 还
	 * @param name
	 * @return
	 */
	public OperationStatus send(String name) {
		// 1. 通过这个名字，找到指定的DVD
		DVD dvd = DVDRepo.getInstance().getDVD(name);

		// 2. 判断这个DVD是否存在
		if (dvd == null) {
			// 说明这个DVD不存在
			return OperationStatus.NotFound;
		}

		// 3. 尝试还这个DVD
		boolean ret = dvd.send();

		if (ret) {
			// 说明还成功了
			return OperationStatus.Success;
		} else {
			// 说明还失败了
			return OperationStatus.StatusError;
		}
	}
	
	
}









