/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import lombok.SneakyThrows;
import ss.FileUtility;

/**
 *
 * @author Acer
 */
public class TCPServer {

    /**
     * @param args the command line arguments
     */
    @SneakyThrows
    public static void main(String[] args) {
        readbytes();
    }

    public static void readbytes() throws Exception, Throwable {
        ServerSocket server = new ServerSocket(6799);
        while (true) {
//            System.out.println("yeni socket ucun gozleyirem");
            Socket connect = server.accept();
//            System.out.println("Urra yeni musteri geldi");
            DataInputStream dr = new DataInputStream(connect.getInputStream());
            String readMessage = readReguest(dr);
            System.out.println(readMessage);
            OutputStream df = connect.getOutputStream();
            DataOutputStream gg = new DataOutputStream(df);
//        byte[] readBytes = FileUtility.readBytes("C:\\R.G. Catalyst\\ss.jpg");
//            byte[] bytes = "text messages".getBytes();
//            gg.writeInt(bytes.length);
//            gg.write(bytes);
//            connect.close();
            writeResponse(gg, "hey i am working");
            connect.close();
//            System.out.println("message length2="+readMessage.length);
//            FileUtility.writeBytes(readMessage, "C:\\Users\\Acer\\Desktop\\abj.jpg");
        }
    }

    private static void writeResponse(OutputStream sout, String s) throws Throwable {
        String response = "HTTP/1.1 200 OK\r\n"
                + "Server: YarServer/2009-09-09\r\n"
                + "Content-Type: text/html\r\n"
                + "Content-Length: " + s.length() + "\r\n"
                + "Connection: close\r\n\r\n";
        String result = response + s;
        sout.write(result.getBytes());
        sout.flush();
    }

    public static byte[] readMessage(DataInputStream din) throws Exception {
        int msgLen = din.readInt();
//        System.out.println("message lenght1="+msgLen);
        byte[] msg = new byte[msgLen];
        din.readFully(msg);
        return msg;
    }

    private static String readReguest(InputStream sin) throws IOException {
        // Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения.
        InputStreamReader isr = new InputStreamReader(sin);
        BufferedReader reader = new BufferedReader(isr);
        String msg = "";
        while (true) {
            String s = reader.readLine();
            if (s == null || s.trim().length() == 0) {
                break;
            } else {
                msg = msg + s + "\r\n";
            }
            System.out.println("Server reguest : " + s);

            System.out.println();
        }
        return msg;
    }

    @SneakyThrows
    public static void sss() {
        ServerSocket server = new ServerSocket(6789);
        while (true) {
            Socket connect = server.accept();
            System.out.println("yeni socket ucun gozleyirem");
            InputStream ss = connect.getInputStream();
            InputStreamReader dd = new InputStreamReader(ss);
            System.out.println("Urra yeni musteri geldi");
            BufferedReader df = new BufferedReader(dd);
            String getmessagefromClient = df.readLine();
            System.out.println("client deyir ki:" + getmessagefromClient);
        }
    }
}
