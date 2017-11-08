package avance;

public class Campo {

    char[] name = new char[30];
    protected String type;
    protected int size;
    protected int size_dec;
    protected boolean key;

    public Campo() {
    }

    public Campo(String type, int size, int size_dec, boolean key) {
        this.type = type;
        this.size = size;
        this.size_dec = size_dec;
        this.key = key;
    }

    public char[] getName() {
        return name;
    }

    public void setName(char[] name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize_dec() {
        return size_dec;
    }

    public void setSize_dec(int size_dec) {
        this.size_dec = size_dec;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }
}
