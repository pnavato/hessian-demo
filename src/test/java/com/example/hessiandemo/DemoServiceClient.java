package com.example.hessiandemo;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.example.hessiandemo.beans.DemoRequest;
import com.example.hessiandemo.beans.DemoResponse;
import com.example.hessiandemo.services.DemoService;

public class DemoServiceClient implements DemoService {

	private DemoService proxy;

	public DemoServiceClient(String baseUrl) throws MalformedURLException {
		HessianProxyFactory factory = new HessianProxyFactory();
		proxy = (DemoService) factory.create(DemoService.class, baseUrl + DemoService.SERVICE_PATH);
	}

	@Override
	public DemoResponse evaluate(DemoRequest req) {
		return proxy.evaluate(req);
	}

}
