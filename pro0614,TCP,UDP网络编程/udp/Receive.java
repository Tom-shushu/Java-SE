package pro0614.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive {

	
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(9999);
			//内容,长度
			byte[] buf = new byte[100];
			int length = buf.length;
			DatagramPacket packet = new DatagramPacket(buf, length);
			//接收
			socket.receive(packet);
			
			byte[] rece = packet.getData();
			String str = new String(rece);
			System.out.println(str);
		} catch (SocketException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
