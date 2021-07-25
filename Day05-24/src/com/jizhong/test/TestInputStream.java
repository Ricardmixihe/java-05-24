package com.jizhong.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 输入流（读）：InputStream
 * 	用来读取硬盘中的文件数据
 */
public class TestInputStream {
	public static void main(String[] args) {
		//父类引用指向子类对象（多态）
		InputStream fis = null;
		try{
			//1. 创建输入流
			fis = new FileInputStream("aaa.txt");
			//2. 读取字节长度
			int size = fis.available();
			System.out.println(size);
			//3. 存储数据的数组ASCLL -128 - 127
			char[] c = new char[200];
			//4. 遍历读取文件中的所有数据
			for(int i = 0;i < size;i++){
				//读取数据 返回值int类型
				//read()：一次只能读取一个字符
				//一个字符  == 两个字节
				c[i] = (char)fis.read();
				System.out.println(c[i]);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			//5. 输入流使用完毕，释放资源
			try{
				fis.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
}
