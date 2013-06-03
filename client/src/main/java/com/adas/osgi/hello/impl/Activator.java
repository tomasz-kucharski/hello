package com.adas.osgi.hello.impl;

import com.adas.osgi.hello.api.HelloService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 * @author Tomasz Kucharski <kucharski.tom@gmail.com>
 * @since 03.06.13 17:07
 */
public class Activator implements BundleActivator {

	private ServiceRegistration<HelloService> helloServiceServiceRegistration;

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("impl started");
		HelloService helloService = new HelloServiceImpl();
		helloServiceServiceRegistration = bundleContext.registerService(HelloService.class, helloService, null);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("impl stopped");
		helloServiceServiceRegistration.unregister();
	}
}
