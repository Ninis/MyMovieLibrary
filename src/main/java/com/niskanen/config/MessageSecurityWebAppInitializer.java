package com.niskanen.config;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Order(2)
public class MessageSecurityWebAppInitializer extends
		AbstractSecurityWebApplicationInitializer {
}
