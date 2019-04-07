package com.valor.practice.learn;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Description transient是Java语言的关键字，用来表示一个域不是该对象串行化的一部分。
 *              当一个对象被串行化的时候，transient型变量的值不包括在串行化的表示中
 * @Author valor.wang
 * Date  2019-04-07 09:08
 **/
public class transientTest {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("ux0001","pwd123");
        ObjectOutputStream ois = null;
        try{
            ois = new ObjectOutputStream(new FileOutputStream("info.out"));
            ois.writeObject(userInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != ois){
                try {
                    ois.close();
                }catch (IOException e){
                    e.printStackTrace();
                }

            }
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("info.out"));
            UserInfo userInfo1 = (UserInfo)in.readObject();
            System.out.println(userInfo1);
        }catch (IOException e){

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class UserInfo implements Serializable{
    private LocalDateTime birthday = LocalDateTime.now();
    private String uid;
    private transient String pwd;

    public UserInfo(String uid, String pwd) {
        this.uid = uid;
        this.pwd = pwd;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        String password = pwd == null?"not set":pwd;
        return "UserInfo{" +
                "birthday=" + birthday +
                ", uid='" + uid + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}