package com.vz;

public class RequestPOJO
{
    private String timestamp;

    private String id;

    private Result result;

    private String sessionId;

    private Status status;

    private String originalRequest;

    public void setOriginalRequest(String originalRequest) {
		this.originalRequest = originalRequest;
	}

	private String lang;

    public String getTimestamp ()
    {
        return timestamp;
    }

    public void setTimestamp (String timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Result getResult ()
    {
        return result;
    }

    public void setResult (Result result)
    {
        this.result = result;
    }

    public String getSessionId ()
    {
        return sessionId;
    }

    public void setSessionId (String sessionId)
    {
        this.sessionId = sessionId;
    }

    public Status getStatus ()
    {
        return status;
    }

    public void setStatus (Status status)
    {
        this.status = status;
    }

   
    public String getLang ()
    {
        return lang;
    }

    public void setLang (String lang)
    {
        this.lang = lang;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timestamp = "+timestamp+", id = "+id+", result = "+result+", sessionId = "+sessionId+", status = "+status+", originalRequest = "+originalRequest+", lang = "+lang+"]";
    }
}