package Serializable;


import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Base64;

public class Cat implements Externalizable {
    private String sA = "A";
    private String sB = "B";
    private String superStr = "SuperSecretString";

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.sA);
        out.writeObject(this.sB);
        out.writeObject(this.encryptStr(this.superStr));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        sA = (String) in.readObject();
        sB = (String) in.readObject();
        superStr = this.decodeStr((String) in.readObject());
    }

    private String encryptStr(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    private String decodeStr(String data) {
        return new String(Base64.getDecoder().decode(data));
    }

    @Override
    public String toString() {
        return "Cat{" +
                "sA='" + sA + '\'' +
                ", sB='" + sB + '\'' +
                ", superStr='" + superStr + '\'' +
                '}';
    }
}
