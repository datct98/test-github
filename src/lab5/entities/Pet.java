package lab5.entities;

public class Pet {
    private static int autoId;
    private int id;
    private String name;
    private String species;
    private Type type;
    private boolean sex;

    public Pet(String name, String species, int type, boolean sex) {
        this.id = ++autoId;
        this.name = name;
        this.species = species;
        if(type==1)
            this.type = Type.DOG;
        else this.type = Type.CAT;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", type=" + type +
                ", sex=" + sex +
                '}';
    }
}
