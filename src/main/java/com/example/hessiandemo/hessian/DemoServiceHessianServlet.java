package com.example.hessiandemo.hessian;

import com.caucho.hessian.server.HessianServlet;
import com.example.hessiandemo.beans.DemoRequest;
import com.example.hessiandemo.beans.DemoResponse;
import com.example.hessiandemo.services.DemoService;

public class DemoServiceHessianServlet extends HessianServlet implements DemoService {

	private static final long serialVersionUID = 1L;

	private DemoService service;

	public DemoServiceHessianServlet(DemoService service) {
		this.service = service;
		setAPIClass(DemoService.class);
		setWhitelist(true);
		allow(DemoRequest.class.getPackage().getName() + ".*");
	}

	@Override
	public DemoResponse evaluate(DemoRequest req) {
		return service.evaluate(req);
	}

}
