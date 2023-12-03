package Member;

public class MemberApp {

    private String id;
    private String name;
    private int point;

    public MemberApp() {
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }

    public MemberApp(String id, String name, int point) {
        super();
        this.id = id;
        this.name = name;
        this.point = point;
    }

    public void Draw() {
        System.out.println(id+ " "+name+" "+point);
    }


    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + ", point=" + point + "]";
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Member m = new Member("20172829", "지현정", 20172829);
        m.Draw();
        // m.toString(); XXXX
        // toString은 문자열만 반환하므로 System.out.println(변수명.toString())
        System.out.println(m.toString());

    }
}