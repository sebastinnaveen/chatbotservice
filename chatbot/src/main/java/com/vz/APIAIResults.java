package com.vz;

public class APIAIResults {
		/*source":"agent","
		"resolvedQuery":"iOS installation",
		"speech":"",""
				+ "action":"vzinstallation.install",""
						+ "actionIncomplete":false,
						"parameters":{},
						"contexts":[],
						"metadata":{"intentId":"0e289ee5-5006-4624-9a36-1aa0e7126eaa","webhookUsed":"true","webhookForSlotFillingUsed":"false","intentName":"VzInstallation"},"fulfillment":{"speech":"installation","messages":[{"type":0,"speech":"installation"}]},"score":0.9}****^^^^*/
	String speech;
	String displayText;
	String data;
	String source;
	public String getSpeech() {
		return speech;
	}
	public void setSpeech(String speech) {
		this.speech = speech;
	}
	public String getDisplayText() {
		return displayText;
	}
	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
