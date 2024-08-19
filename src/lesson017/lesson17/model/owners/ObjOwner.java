package model.owners;

//класс, объекты которого могу владеть всем, чем угодно
public class ObjOwner {
    private String name;
    private Object subject;

    public ObjOwner() {
    }

    public ObjOwner(String name, Object subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getSubject() {
        return subject;
    }

    public void setSubject(Object subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "ObjOwner{" +
                "name='" + name + '\'' +
                ", subject=" + subject +
                '}';
    }
}
