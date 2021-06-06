package Objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class TCP_Client extends ConcreteSubject implements Runnable {
	String host = "192.168.0.110";
	int port = 1234;

	int rotation_threshold = 2;
	int shake_threshold = 1;
	int power_threshold = 5;

	JSONParser parser = new JSONParser();

	TCP_Client(String host, int port) {
		this.host = host;
		this.port = port;
		Thread t = new Thread(this);
		t.start();
	}

	
	@Override
	public void run() {
		try {
			Socket socket = new Socket(this.host, this.port);
			InputStream input = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(input);
			BufferedReader br = new BufferedReader(reader);
			String line = "";
			while ((line = br.readLine()) != null) {
				//System.out.println(line);

				JSONObject jsonObject = (JSONObject) parser.parse(line);
				String knob = (String) jsonObject.get("gyroRotationY");
				float rotation = Math.abs(Float.parseFloat(knob));
				String run = (String) jsonObject.get("motionRoll");
				float shake = Math.abs(Float.parseFloat(run));
				String power = (String) jsonObject.get("avAudioRecorderAveragePower");
				float voice = Math.abs(Float.parseFloat(power));
				//System.out.println(voice);

				if(rotation > rotation_threshold) {
					// send a message to whoeever wants it 
					Message m = new Message(this, "door", "unlock"); 
					publishMessage(m);

				}
				if(shake > shake_threshold)
				{
					Message m = new Message(this, "mummy", "run");
					publishMessage(m);
				}
				if(voice < power_threshold) {
				
					Message m = new Message(this, "speaking", "voice"); 
					publishMessage(m);
				}
				
				

			}
		} catch (UnknownHostException ex) {
			System.out.println("Server not found: " + ex.getMessage());
		} catch (IOException ex) {
			System.out.println("I/O error: " + ex.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}