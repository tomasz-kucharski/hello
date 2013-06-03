package com.adas.osgi.hello.impl;

import com.adas.osgi.hello.api.HelloService;

/**
 * @author Tomasz Kucharski <kucharski.tom@gmail.com>
 * @since 03.06.13 17:12
 */
public class HelloServiceImpl implements HelloService {

	public void sayHello() {
		System.out.println("HELLO FROM Hello Service Impl");
	}
}
