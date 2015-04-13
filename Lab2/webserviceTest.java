package com.jersey.webservice;
//import static org.junit.Assert.*;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLConnection;

public class webserviceTest {

		private Object connection;
	
	@SuppressWarnings("unused")
	private Object json_restResponseUnit() {
		try {
			//String sendFile = "E:/Program Files/Java/workspace/IOFiles/Jsonfile.txt";;
			String sendUrl = "http://localhost:8080/Server/rest/webservice";
	        String receiveString = "";
	        URLConnection connectionWithRest = null;
            Object sendString=new Object();
			connectionWithRest = passJsonToRest(sendUrl, sendString);

            // receive return code from restful service
            receiveString = receiveReturnCode(connectionWithRest);

            // show what's received from restful web service
            showReceived(receiveString);

            return true;
		} catch (Exception e){
			System.out.println(e);
		}
		return connection;
		}



	private String receiveReturnCode(URLConnection connectionWithRest) {
		connection = null;
		System.out.println("***TestLine75*** \nPrint connection is "+ connection.toString());

        String receiveString = "";

        try {
            // receive ReturnCode from rest service
            InputStreamReader inReader = new InputStreamReader(((URLConnection) connection).getInputStream());
            BufferedReader in = new BufferedReader(inReader);
            String receiveLine;
            while ((receiveLine = in.readLine()) != null) {
                System.out.println(receiveLine);
                receiveString += (receiveLine + "\n");
            }
            in.close();
            System.out.println("\nREST Service Invoked Successfully...");
        } catch (Exception e) {
            System.out.println("\nError while receiving REST Service ReturnCode");
            System.out.println(e);
        }
        return receiveString;

	}

  // @Test
	
	//public void testJson_restResponse() {
	//assertEquals(true, json_restResponseUnit());
		
	//}

	private URLConnection passJsonToRest(String sendUrl, Object sendString) {
		return null;
	}



	private void showReceived(String receiveString) {
	
	}



	@Test
	public void testSayPlainTextHello() {
		String returnCode = new String("Hello,Server!\n");
		System.out.print(returnCode);
	}
	@Test
	public void testSayPlainTextHello1(){
		String returncode=new String("After n ms,the server will be started\n");
		System.out.print(returncode);
	
	}

}
