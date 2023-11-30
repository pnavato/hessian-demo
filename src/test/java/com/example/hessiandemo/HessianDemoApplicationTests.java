package com.example.hessiandemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import com.example.hessiandemo.beans.DemoRequest;
import com.example.hessiandemo.beans.DemoResponse;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HessianDemoApplicationTests {

	@LocalServerPort
	private int randomPort;

	@Test
	void callHessianService() throws MalformedURLException {
		DemoServiceClient client = new DemoServiceClient("http://localhost:" + randomPort);

		DemoRequest req = new DemoRequest();
		req.setPayload("Hello, world!");
		DemoResponse res = client.evaluate(req);
		assertEquals("I evaluated [Hello, world!]", res.getResult());
	}

}
