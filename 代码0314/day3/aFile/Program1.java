package com.qianfeng.week4.day3.aFile;

// 文件操作和IO流部分，需要导入这个包
import java.io.*;
import java.util.Date;

public class Program1 {
	public static void main(String[] args) {
		// 如果有多个路径拼接，分隔这些路径使用
		// 例如：环境变量
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		
		// 分隔层级关系的路径分隔符	\
		// C:\Users\Administrator\Desktop
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		
		
		
		// File类：是一个文件、目录的抽取。
		File file = new File("C:\\Users\\luds\\Desktop\\作业题.txt");
		// File file = new File("C:\\Users\\luds\\Desktop", "jdk api 1.8_google");
		
		// 指定的路径下有没有文件（夹）的存在。
		System.out.println(file.exists());
		// 判断指定路径的内容是不是一个文件
		System.out.println(file.isFile());
		// 判断指定路径的内容是不是一个文件夹
		System.out.println(file.isDirectory());
		
		// 创建指定的文件夹
		// 创建失败：
		// 1. 指定路径下已经有一个同名的文件(夹)存在。
		// 2. 创建多级目录是不支持的。
		// System.out.println(file.mkdir());
		// 可以创建多级目录
		// System.out.println(file.mkdirs());
		
		
		try {
			// 在指定的路径下创建一个文件
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(file.isHidden());			// 判断一个文件是否是隐藏的
		System.out.println(file.canRead());				// 判断一个文件是否是可读的
		System.out.println(file.canWrite());			// 判断一个文件是否是可写的
		System.out.println(file.canExecute());			// 判断一个文件是否是可执行的
		
		System.out.println(file.length());				// 获取一个文件的大小（字节）
		
		
		System.out.println(file.getName());				// 获取文件名
		System.out.println(file.getPath());				// 获取路径
		System.out.println(file.getAbsolutePath());		// 获取一个文件的绝对路径
		
		System.out.println(file.getParent());			// 获取上一级的路径
		System.out.println(file.getParentFile());		// 获取上一级文件
		
		System.out.println(file.lastModified());		// 获取最后修改的时间
		System.out.println(new Date(file.lastModified()));
		
		
		
		// System.out.println(file.setReadOnly());			// 设为只读
		System.out.println(file.setReadable(true));		
		System.out.println(file.setWritable(false));
		
		// 需求：把这个文件重名为 exercise.txt，并保存到同样的目录下
		// System.out.println(file.renameTo(new File("exercise.txt")));
		// System.out.println(new File("exercise.txt").getAbsolutePath());
		// System.out.println(file.renameTo(new File(file.getParent(), "exercise.txt")));
		
		// 删除文件（备注：这个删除文件，是直接将这个文件从磁盘删除，不进回收站）
		file.delete();
		
		
		
		/*
		String[] names = {"富强", "民主", "文明", "和谐", "自由", "平等", "公正", "法制", "爱国", "敬业", "诚信", "友善"};
		
		String path = "";
		for (String name : names) {
			path += name + "\\";
		}
		
		new File("C:\\Users\\luds\\Desktop", path).mkdirs();
		*/
		
	}
}
