package com.example.hessiandemo.services;

import com.example.hessiandemo.beans.DemoRequest;
import com.example.hessiandemo.beans.DemoResponse;

public interface DemoService {

	public static final String SERVICE_PATH = "/hessian/DemoService";

	public DemoResponse evaluate(DemoRequest req);

}
