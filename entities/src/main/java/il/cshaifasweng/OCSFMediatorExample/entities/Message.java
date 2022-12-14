package il.cshaifasweng.OCSFMediatorExample.entities;

import java.io.Serializable;

public class Message implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 24613557937684578L;
    private String message;
    private Object object;
    private Object object2;
    private Object object3;
    private Object object4;



    public Message(String msg, Object obj) {
        this.message = msg;
        this.object = obj;
    }

    public Message(String msg, Object obj,Object obj2) {
        this.message = msg;
        this.object = obj;
        this.object2 = obj2;
    }

    public Message(String msg, Object obj,Object obj2, Object obj3) {
        this.message = msg;
        this.object = obj;
        this.object2 = obj2;
        this.object3 = obj3;
    }

    public Message(String msg, Object obj,Object obj2, Object obj3, Object obj4) {
        this.message = msg;
        this.object = obj;
        this.object2 = obj2;
        this.object3 = obj3;
        this.object4 = obj4;
    }

    public Message(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return message;
    }

    public Object getObject () {
        return this.object;
    }

    public Object getObject2 () {
        return this.object2;
    }

    public Object getObject3 () {
        return this.object3;
    }

    public void setMessage(String msg) {
        this.message=msg;
    }

    public void setObject(Object obj) {
        this.object=obj;
    }

    public void setObject2(Object obj) {
        this.object2=obj;
    }

    public void setObject3(Object obj) {
        this.object3=obj;
    }

    public String toString() {
        return this.message;
    }

    public Object getObject4() {
        return object4;
    }

    public void setObject4(Object object4) {
        this.object4 = object4;
    }
}