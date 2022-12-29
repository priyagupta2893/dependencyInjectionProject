package com.cdp.dependencyInjectionProject.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchDao {
	
	@Autowired
	JdbcConnection connection;

	public JdbcConnection getConnection() {
		return connection;
	}

	public void setConnection(JdbcConnection connection) {
		this.connection = connection;
	}

}
