package ExceptionHandling;

/**
 * Created by badkass on 7/26/2017.
 */
public class User {
    int uid;
    String name;
    int age;
    int ratings;

    public User(int uid, String name, int age, int ratings) {
        this.uid = uid;
        this.name = name;
        this.age = age;
        this.ratings = ratings;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}
