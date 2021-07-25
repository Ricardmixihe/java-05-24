package com.jizhong.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 输出流（写）：OutputStream
 * 		将程序中数据写入到硬盘中。
 *
 *FileOutputStream(String name, boolean append) 
 *		name：表示文件路径
 *		append：是否追加数据
 *			true：表示在原有的数据上追加数据
 *			false：表时覆盖原有数据
 */
public class TestOutputStream {
	public static void main(String[] args) throws IOException{
		//1. 创建输出流对象
		OutputStream fos = new FileOutputStream("aaa.txt");
		//2. 调用输出流对象方法写数据
		//2.1 定义写出到文件中的数据
		String message = "我爱Java，好好学习，天天向上！！";
		String newLine = "\r\n";
		//2.2 将文字数据转换为字节（byte）数组
		byte[] bytes = message.getBytes();
		byte[] byteLints = newLine.getBytes();
		//write(bytes)：输出数据方法
		//3. 调用write方法输出（写）数据
		fos.write(byteLints);
		System.out.println(bytes[1]);
		fos.write(bytes,2,bytes.length-2);
		//4. 关闭资源
		fos.close();
	}
}
