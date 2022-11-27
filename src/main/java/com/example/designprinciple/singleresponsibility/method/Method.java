package com.example.designprinciple.singleresponsibility.method;

public class Method {

    private void updateUsername(String username) {
    }

    private void updateAddress(String username) {
    }


    /** 不符合
     private void updateUserInfo(String username,String address) {
     }
     */
    /**
     * 不符合，应该拆开为两个方法
     private void updateUserInfo(String username, String address, boolean bool) {
     if (bool) {
     // do something
     } else {
     // do something
     }
     }
     */


}
