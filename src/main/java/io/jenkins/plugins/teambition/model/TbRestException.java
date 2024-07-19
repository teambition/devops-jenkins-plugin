package io.jenkins.plugins.teambition.model;

public class TbRestException extends Exception {
    
    public static final long serialVersionUID = 123456789L;
    
    private String code;
    
    private String message;
    
    public TbRestException(String code, String message) {
        super(message);
        setCode(code);
        setMessage(message);
    }
    
    @Override
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
}
