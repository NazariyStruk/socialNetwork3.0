package model;

import java.util.Collections;
import java.util.List;

public class Response<T> {
	private List<T> body;
	private String errorMessage;

	public List<T> getBody() {
		if (this.body == null) {
			System.out.println(errorMessage);
			return Collections.emptyList();
		} else {
			return body;
		}
	}

	public void setBody(List<T> body) {
		this.body = body;
	}

	public void setBody(T body) {
		this.body = List.of(body);
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
