import java.util.List;

public class dendiModel {
    public String name, lastName, birthday, country;
    public List<String> org;
    public int age;
    public dendiModel.Hero hero;


    public static class Hero {
        public String hero;
        public String mid;
        public String hard;
        public String izi;
    }
}

