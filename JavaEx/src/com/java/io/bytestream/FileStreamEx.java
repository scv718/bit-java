package com.java.io.bytestream;

import java.io.*;

public class FileStreamEx {

	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "img.jpg";
	static String target = rootPath + "img_copy.jpg";
	public static void main(String[] args) {
		// source -> FIS -> data -> FOS -> target
		try {
			
			InputStream bis = new FileInputStream(source);
			OutputStream bos = new FileOutputStream(target);
			
			int data = 0; // 저장용 변수
			
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			
			bos.close();
			bis.close();
			
			System.out.println("파일 복사");
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을수 없음");
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
