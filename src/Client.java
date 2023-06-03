import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args){

        Socket s = null;
        try {
            s = new Socket("127.0.0.1",8090);
            DataInputStream din = new DataInputStream(s. getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream()) ;
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

            String msgin="" , msgout="";

            while(!msgin.equals("end")){
                msgout=br.readLine();
                dout.writeUTF(msgout);
                msgin=din.readUTF();
                System.out.println(msgin);

            }
            s.close();
        } catch (IOException e) {

        }

    }
}
