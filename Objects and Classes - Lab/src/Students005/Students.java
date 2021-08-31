package Students005;

public class Students {
    private String first;
    private String last;
    private int age;
    private String city;

    public Students(String first, String last, int age, String city) {
        this.first = first;
        this.last = last;
        this.age = age;
        this.city = city;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return this.city;
    }
}

