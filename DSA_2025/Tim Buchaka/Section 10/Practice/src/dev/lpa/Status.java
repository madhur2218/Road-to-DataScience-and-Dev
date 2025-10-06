package dev.lpa;

public enum Status{
    SUCCESS(200),
    ERROR(500),
    NOT_FOUND(404);
    
    private int code;
    
    Status(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
