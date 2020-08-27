package com.java.network.echoserver.v1;

import java.io.*;
import java.net.*;

// v1
public class Server {

	public static void main(String[] args) {
		// 1. 서버 소켓 생성
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			// 2. bind(주소, 포트연결)
			InetSocketAddress local = new InetSocketAddress("127.0.0.1" ,10000); // 로컬호스트 , 포트
			
			serverSocket.bind(local); // 바인드
			
			System.out.println("<서버 시작>");
			System.out.println("[연결을 기다립니다.]");
			// 3. 접속 대기
			Socket socket =serverSocket.accept();
			
			// 접속 후 처리: 클라이언트 정보 확인
			InetSocketAddress client = (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[클라이언트 연결");
			System.out.println(client.getAddress() + ":" + client.getPort());
			// 클라이언트로부터 메세지 수신
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br= new BufferedReader(isr);
			
			
			// Echo Back을 위한 OutputStream 확보
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			
			// 메시지 읽기
			String message;
			while((message = br.readLine()) != null) {
				System.out.println("수신 메시지: " +message);
				// Echo Back
				
				System.out.println("Echo Back: " +message);
				bw.write("[Echo]: " +message);
				bw.newLine();
				bw.flush();
			}
			
			// 후처리
			System.out.println("[접속이 종료되었습니다.]");
			System.out.println("====================");
			System.out.println("<서버종료>");
			
			// 스트림 닫기
			bw.close();
			br.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			// 서버 소켓 닫기
			try {
			serverSocket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
