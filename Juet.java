import java.io.*;
class GetSet {

    private String name;
    public String getName() { return name; }
    public void setName(String N)
    {
        this.name = N;
    }
}

class Juet {

    public static void main(String[] args)
    {
        GetSet obj = new GetSet();
        obj.setName("Jaypee");
        System.out.println(obj.getName());
    }
}
