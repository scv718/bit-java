package com.java.io.bytestream;

import java.io.*;

public class FileClassEx {

	static String rootPath = System.getProperty("user.dir") + "\\files\\"; // 프로젝트 DIR
	public static void main(String[] args) {
		// rootPath 내부의 정보 확인
		File root = new File(rootPath);
		// 실제로 있는 파일인지 확인
		System.out.println("rootPath exists ? " + root.exists());
		
		// 디렉터리 만들기
		if(!root.exists()) {
			root.mkdirs();
		}
		
		// 파일의 정보 확인
		printFileInfo(root);

		
		// 디렉토리 내부에 파일을 생성
		File file = new File(rootPath + "myFile.txt");
		
		if(!file.exists()) { // 파일이 없으면
			// 생성
			// 예외처리 필수
			
			try {
				file.createNewFile(); // 실제 파일 생성
				System.out.println("파일 생성 성공");
			
			}catch (IOException e) {
				System.out.println("파일을 생성하지 못했습니다");
			}
		}
		
		printFileInfo(root);
		
		// 파일 삭제 
		
		file.delete();
		printFileInfo(root);
	}
	
	private static void printFileInfo(File f) {
		
		System.out.println("----------");
		
		// 이 파일이 디렉터리 인가?
		if(f.isDirectory()) {
			// 내부 파일 목록 확인
			System.out.println("Directory: " +f.getName());
			// 목록 확인
			File[] files = f.listFiles();
			
			for(File file: files) {
				System.out.println(file.isDirectory() ? "d": "f");
				System.out.printf("%s - %d%n",file.getName(),file.length());
			}
		}else {
			// 파일이 아니면
			System.out.println("File: " + f.getName());
		}
		System.out.println("----------");
	}

}
