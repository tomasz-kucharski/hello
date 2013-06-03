package com.adas.osgi.hello.client;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @author Tomasz Kucharski <kucharski.tom@gmail.com>
 * @since 03.06.13 17:07
 */
public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("client started");

	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("client stopped");
	}
}
