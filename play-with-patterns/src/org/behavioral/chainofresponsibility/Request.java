package org.behavioral.chainofresponsibility;

/**
 * Request to be processed for some Staff in the change of responsibilities.
 * @author FExposito
 *
 */
public class Request {

	private ResponsibilityLevel responsibilityLevel;
	private String description;

	public Request(ResponsibilityLevel responsibilityLevel, String message) {
		this.responsibilityLevel = responsibilityLevel;
		this.description = message;
	}

	public ResponsibilityLevel getResponsibilityLevel() {
		return responsibilityLevel;
	}

	public void setResponsibilityLevel(ResponsibilityLevel responsabilityLevel) {
		this.responsibilityLevel = responsabilityLevel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
