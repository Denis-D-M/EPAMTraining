package IO;

import java.io.Serializable;

public class Cat implements Serializable {
    private int legs = 4;
    private String name;
    transient private String weigth;
}
