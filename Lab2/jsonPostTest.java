package jsonPost;

//import static org.junit.Assert.*;

//import org.apache.commons.lang.StringUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import java.net.URLConnection;
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.net.URL;



public class jsonPostTest {
	private static String sendFile;
	private static String sendFile1;
	private static String sendUrl;
	private static String sendUrl1;

	@Before
	public void setUp() throws Exception {
		sendFile = "E:/Program Files/Java/workspace/IOFiles/Jsonfile.txt";
		sendFile1 = "E:/Program Files/Java/workspace/IOFiles/a";
        sendUrl = "http://localhost:8080/Server/rest/webservice";
        sendUrl1 = "http://localhost:8080/Server";
	}
	
	@After
    public void tearDown() throws Exception {
    }
	
	@Test
	public void testInputJson() {
		System.out.println("***********1 Test inputing the sendfile:***********\n");
		String tmp_jsonString = jsonPost.inputJson(sendFile);
			System.out.println(tmp_jsonString);
	}
	@Test
	public void testInputJson1() {
		System.out.println("***********2 Test inputing the sendfile1:***********\n");
		String tmp_jsonString = jsonPost.inputJson(sendFile1);
			System.out.println(tmp_jsonString);
	}


	public void testCheckJson() {
		System.out.println("***********3 Test checking the sendfile1:***********\n");
		String tmp_jsonString = jsonPost.inputJson(sendFile1);
		try {
			jsonPost.checkJson(tmp_jsonString);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}


    @Test
	public void testPassJsonToRest() {
    	System.out.println("***********4 Test the connection:***********\n");
	    URLConnection tmp_connection = jsonPost.passJsonToRest(sendUrl, sendFile);
		if(tmp_connection == null)
			System.out.println("链接失败\n\n");
	}
	

	@Test
	public void testPassJsonToRest2() {
		System.out.println("***********5 Test the connection2:***********\n");
		URLConnection tmp_connection = jsonPost.passJsonToRest(sendUrl1, sendFile1);
		if(tmp_connection == null)
			System.out.println("链接失败\n\n");
	}

	@Test
	public void testReceiveReturnCode() {
		System.out.println("***********6 Test the ReceiveReturnCode:***********\n");
		URLConnection tmp_connection = jsonPost.passJsonToRest(sendUrl, sendFile);
		if(tmp_connection != null){
			String tmp_receive = jsonPost.receiveReturnCode(tmp_connection);
			System.out.println(tmp_receive);
		}
	}
	@Test
	public void testReceiveReturnCode2() {
		System.out.println("***********7 Test:若链接失败，又没处理**************\n");
		URLConnection tmp_connection = jsonPost.passJsonToRest("", sendFile);
		if(tmp_connection != null){
		String tmp_receive = jsonPost.receiveReturnCode(tmp_connection);
		System.out.println(tmp_receive);
	}
	}
	@Test
	public void testReceiveReturnCode3() {
		System.out.println("***********8 Test:若链接失败，做了验证之类的**************\n");
		URLConnection tmp_connection = jsonPost.passJsonToRest("", sendFile1);
		if( tmp_connection!=null ){//验证之类
			String tmp_receive = jsonPost.receiveReturnCode(tmp_connection);
			System.out.println(tmp_receive);
		}
	}
	
	@Test
    public void testShowReceived(){
    	
   }
}
