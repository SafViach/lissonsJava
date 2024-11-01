package _02_serialization._04_external;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Base64;
import java.util.StringJoiner;

public class ExtClass implements Externalizable {
    String firstName;
    String lastName;
    String password;

    public ExtClass() {
    }

    public ExtClass(String firstName, String lastName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(firstName);
        out.writeObject(lastName);
        out.writeObject(encrypt(password));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        firstName = (String) in.readObject();
        lastName = (String) in.readObject();
        password = decrypt((String)in.readObject());
    }

    private String encrypt(String data) {
        var encrypted = Base64.getEncoder().encodeToString(data.getBytes());
        System.out.println(encrypted);
        return encrypted;
    }

    private String decrypt(String data) {
        var decrypted = new String(Base64.getDecoder().decode(data));
        System.out.println(decrypted);
        return decrypted;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ExtClass.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("password='" + password + "'")
                .toString();
    }
}
