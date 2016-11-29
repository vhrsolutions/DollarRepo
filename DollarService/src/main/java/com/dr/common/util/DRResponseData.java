/**
 *
 */
package com.dr.common.util;

import java.util.ArrayList;
import java.util.List;

import com.dr.common.constants.DRResponseStatus;

/**
 * @author Administrator
 *
 */
public class DRResponseData<T> {

	private Long requestId;
	private DRResponseStatus drResponseStatus = DRResponseStatus.SUCCESS;
	private List<DRResponseMessage> responseMessages = new ArrayList<DRResponseMessage>();
	private T responseData;

	public DRResponseData() {
		// TODO Auto-generated constructor stub
	}

	public DRResponseData(final long requestId) {
		this.requestId = requestId;
	}

	public DRResponseData(final long requestId, final T responseData) {
		this.requestId = requestId;
		this.responseData = responseData;
	}

	public DRResponseData(final long requestId, final DRResponseStatus drResponseStatus) {
		this.requestId = requestId;
		this.drResponseStatus = drResponseStatus;
	}

	public DRResponseData(final long requestId, final DRResponseStatus drResponseStatus,
			final List<DRResponseMessage> responseMessages) {
		this.requestId = requestId;
		this.drResponseStatus = drResponseStatus;
		if (responseMessages != null) {
			this.responseMessages = responseMessages;
		}
	}

	public DRResponseData(final long requestId, final DRResponseStatus drResponseStatus, final T responseData) {
		this.requestId = requestId;
		this.drResponseStatus = drResponseStatus;
		this.responseData = responseData;
	}

	public DRResponseData(final long requestId, final DRResponseStatus drResponseStatus,
			final List<DRResponseMessage> responseMessages, final T responseData) {
		this.requestId = requestId;
		this.drResponseStatus = drResponseStatus;
		if (responseMessages != null) {
			this.responseMessages = responseMessages;
		}
		this.responseData = responseData;
	}

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(final Long requestId) {
		this.requestId = requestId;
	}

	public DRResponseStatus getDrResponseStatus() {
		return drResponseStatus;
	}

	public void setDrResponseStatus(final DRResponseStatus drResponseStatus) {
		this.drResponseStatus = drResponseStatus;
	}

	public List<DRResponseMessage> getResponseMessages() {
		return responseMessages;
	}

	public void setResponseMessages(final List<DRResponseMessage> responseMessages) {
		this.responseMessages = responseMessages;
	}

	public T getResponseData() {
		return responseData;
	}

	public void setResponseData(final T responseData) {
		this.responseData = responseData;
	}

	public void addResponseMessage(final DRResponseMessage responseMessage) {
		if (responseMessage != null) {
			this.responseMessages.add(responseMessage);
		}
	}

	public void addResponseMessages(final List<DRResponseMessage> responseMessages) {
		if (responseMessages != null) {
			this.responseMessages = responseMessages;
		}
	}

	@Override
	public String toString() {
		return "DRResponse[requestId=" + requestId + ", drResponseStatus=" + drResponseStatus + "responseMessages"
				+ responseMessages + ", responseData=" + responseData + "]";
	}
}
