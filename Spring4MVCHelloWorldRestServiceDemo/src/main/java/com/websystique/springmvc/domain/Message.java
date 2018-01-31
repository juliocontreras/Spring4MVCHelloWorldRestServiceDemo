package com.websystique.springmvc.domain;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlRootElement(name = "player")
public class Message {
 
    String name = "messi";
    String text = "Hello messi";
 
    public Message(){
         
    }
     
    public Message(String name, String text) {
        this.name = name;
        this.text = text;
    }
 
    @XmlElement
    public String getName() {
        return name;
    }
     
    @XmlElement
    public String getText() {
        return text;
    }
 
}
