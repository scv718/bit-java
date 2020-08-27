package com.java.network.echoserver.v1;


import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) {
		// 1. Socket 생성
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			System.out.println("<클라이언트 시작>");
			System.out.println("[연결을 요청]");
			// 2. 서버 정보 확보
			InetSocketAddress remote  = new InetSocketAddress("127.0.0.1", 10000);
			
			// 3. 서버에 접속 시도
			socket.connect(remote); // connect 시도 
			
			System.out.println("[서버에 연결 되었습니다]");
			
			// 서버로 메세지 전송: Stream IO 활용
			// OutputStream 확보
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8"); // Main Stream , 텍스트 인코딩 정보
			BufferedWriter bw = new BufferedWriter(osw);
			
			// 서버로부터 메세지 수신을 위한 InputStream 확보
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			/*
			 * String message = "테스트 요청 메세지"; bw.write(message);
			 * System.out.println("클라이언트 전송 메세지: " + message); bw.close();
			 */
			
			BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in)); // 키보드로 부터 한 줄씩 입력
			
			// /q -> 전송중지
			while(true) { //무한루프
				String message = keyReader.readLine(); // 한 줄 읽기
				
				if(message.equals("/q")) {
					System.out.println("접속을 종료합니다.");
					break;
				}
				bw.write(message); // 메세지 전송
				bw.newLine(); // 새 라인
				bw.flush(); // 버퍼 비우기
				System.out.println("전송할 메세지: " + message);
				
				// 수신 메시지 확인
				String rcvMsg = br.readLine();
				System.out.println("수신한 메세지: " +rcvMsg);
			}
			
			// 종료 
			System.out.println("<클라이언트 종료>");
			
			bw.close();
			br.close();
		}catch(ConnectException e) {
			System.err.println("[접속이 거부되었습니다]");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close(); // 자원 정리
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		// 2. 서버 정보 확보
		// 3. 서버에 접속 시도

	}

}
