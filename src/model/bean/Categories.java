package model.bean;

public class Categories {

    public Categories(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Categories() {
    }

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
