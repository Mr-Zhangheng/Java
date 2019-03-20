package com.qianfeng.week4.day2.exercise;

/**
 * 表示借、还操作的结果
 * @author luds
 */
public enum OperationStatus {
	Success,		// 操作成功	
	NotFound,		// 没有找到指定的DVD
	StatusError		// 状态异常（借的时候显示已借出、还的时候显示已归还）
}
