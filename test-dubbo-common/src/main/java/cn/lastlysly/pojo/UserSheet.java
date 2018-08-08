package cn.lastlysly.pojo;

import java.io.Serializable;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-08-06 11:12
 **/

//对象要实现序列化接口
//网络传输对象需要序列化，需要转化为二进制流来传输。
public class UserSheet implements Serializable {
    private int userId;
    private String userName;
    private int userAge;

    public UserSheet(int userId, String userName, int userAge) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
    }

    public UserSheet() {
    }

    @Override
    public String toString() {
        return "UserSheet{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
