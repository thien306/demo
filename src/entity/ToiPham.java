package entity;

public class ToiPham {

    private String name;

    private int age;

    private String sex;

    private String toidanh;

    public ToiPham(String name, int age, String sex, String toidanh) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.toidanh = toidanh;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getToidanh() {
        return toidanh;
    }

    public String danh(String tool){
        return "Danh bang:" + tool;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setToidanh(String toidanh) {
        this.toidanh = toidanh;
    }

    @Override
    public String toString() {
        return "entity.ToiPham{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", toidanh='" + toidanh + '\'' +
                '}';
    }
}
