package de.refactoringbottrainer.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * This class is used within the application.yml file.
 * 
 * @author Stefan Basaric
 *
 */
@Component
@ConfigurationProperties(prefix = "wit")
public class WitConfiguration {

	private String witClientToken = "";

	public String getWitClientToken() {
		return witClientToken;
	}

	public void setWitClientToken(String witClientToken) {
		this.witClientToken = witClientToken;
	}

}
