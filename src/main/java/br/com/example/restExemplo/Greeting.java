package br.com.example.restExemplo;

public class Greeting {
private  Long ID;
private String CONTENT;

    public Greeting(Long ID, String CONTENT) {
        this.ID = ID;
        this.CONTENT = CONTENT;
    }

    public Long getID() {
        return ID;
    }

    public String getContent() {
        return CONTENT;
    }

    public void setContent(String CONTENT) {
        this.CONTENT = CONTENT;
    }
public void setID(Long ID){
        this.ID = ID;
}
}
