package Model;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.util.ArrayList;

public class Contact {
    private String name;
    private int phoneNumber;
    private ContactType type;
    private String date;

    public Contact(String name, int phoneNumber, ContactType type){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    private ArrayList<String> CallLog = new ArrayList<>();

    //getters
    public String getName() { return name; }
    public int getPhoneNumber() {return phoneNumber;}
    public ContactType getType() {return type;}
    public ArrayList<String> getCallLog() {return CallLog;}

    //setters
    public void setName(String newname) {name = newname;}
    public void setNumber(int newNum) {phoneNumber = newNum;}
    public void setType(ContactType newtype) {type = newtype;}
    //
    // modfies: this
    // effects: adds a date to call log
    public void call(String date){
        CallLog.add(date);
    }




    public String automateResponse(ContactType type){
        if (type.equals("WORK")){
            return "I'll get back to you at work.";
        }else if (type.equals("FAMILY")){
            return "See you at home";
        }
        else {
            return "Meet you at the cafe";
        }
    }






}
