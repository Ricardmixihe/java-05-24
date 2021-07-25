package com.jizhong.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestInputStrame02 {
	public static void main(String[] args){
		InputStream fis = null;
		try{
			//1. 创建输入流读取数据
			fis = new FileInputStream("aaa.txt");
			//2. 定义每次可以读取的字节数
			byte[] bytes = new byte[1024];//1kb  存储读取到的数据
			//3. 读取文件中字节，并且把读取到的字节存储到字节数组中
			/**
			 * read(bytes)：
			 * 		返回值：
			 * 			-1：没有读取到数据
			 * 			1：读取到数据了
			 */
			int len = 0;
			while(fis.read(bytes) != -1){//还有数据
				//4. 将字节数组转换为可读字符串
				len = bytes.length;
				String data = new String(bytes,0,len);//String(bytes,起始索引,转换字节数组长度)
				//5. 打印读取数据
				System.out.println(data);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				//6. 关闭资源
				fis.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
}
