package com.example.hessiandemo.services;

import org.springframework.stereotype.Service;

import com.example.hessiandemo.beans.DemoRequest;
import com.example.hessiandemo.beans.DemoResponse;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public DemoResponse evaluate(DemoRequest req) {
		DemoResponse res = new DemoResponse();
		res.setResult("I evaluated [" + req.getPayload() + "]");
		return res;
	}

}
