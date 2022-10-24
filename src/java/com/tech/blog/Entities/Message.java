
package com.tech.blog.Entities;


public class Message {
    
    private String content;
    private String type;
    private String cssClass;

    public Message(String content, String type, String cssclass) {
        this.content = content;
        this.type = type;
        this.cssClass = cssClass;
    }
    
    //getter and setter

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssclass) {
        this.cssClass = cssClass;
    }
    
}
