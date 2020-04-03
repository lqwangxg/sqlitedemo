package com.mbp.lqwangxg.model.base;

public class ResponseResult {

	private boolean isSuccess;
	private String statusCode;
	private String message;
	private Object data;
	
    public ResponseResult(String code, String messageString){
    	this.statusCode = code;
    	this.message = messageString;
    	this.isSuccess = false;
    }
    
    public ResponseResult(String code) {
		
	}
    
    public ResponseResult(){
    }
	
	// 結果
	public boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(boolean value) {
		this.isSuccess = value;
	}

	// ステータスコード
	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String value) {
		this.statusCode = value;
	}

	// メッセージ
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String value) {
		this.message = value;
	}

	// データ
	public Object getData() {
		return this.data;
	}

	public void setData(Object value) {
		this.data = value;
	}

}
