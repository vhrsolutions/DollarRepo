package com.dr.common.util;

public class DRRequestData<T> {

	private long requestId;
	private T requestData;

	public DRRequestData() {
		// TODO Auto-generated constructor stub
	}

	public DRRequestData(final T requestData) {
		this.requestData = requestData;
	}

	public DRRequestData(final long requestId, final T requestData) {
		this.requestId = requestId;
		this.requestData = requestData;
	}

	public long getRequestId() {
		return requestId;
	}

	public void setRequestId(final long requestId) {
		this.requestId = requestId;
	}

	public T getRequestData() {
		return requestData;
	}

	public void setRequestData(final T requestData) {
		this.requestData = requestData;
	}

	@Override
	public String toString() {
		return "RequestData [requestId=" + requestId + ", requestData=" + requestData + "]";
	}
}
