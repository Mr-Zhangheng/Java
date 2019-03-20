package com.qianfeng.week4.day4.cTransfer;

import java.io.*;

public class OutputStreamWriterDemo {
	public static void main(String[] args) {
		
		OutputStreamWriter writer = null;
		
		try {
			writer = new OutputStreamWriter(new FileOutputStream("file\\test2", true), "utf-8");
			
			
			writer.write("”„œ„»‚Àø°¢π¨±£º¶∂°°¢π¯∞¸»‚°¢’Ù—Ú∏·°¢’Ù–‹’∆...");
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
