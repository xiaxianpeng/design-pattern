package com.example.designpattern.structural.proxy;

/**
 * // 代理类，添加权限检查
 * Created on 2024/11/24 15:44
 */
public class PermissionProxy implements Service {

    private Service realService;

    public PermissionProxy(Service realService) {
        this.realService = realService;
    }

    @Override
    public void performAction() {
        if (getCurrentUser().isRoot()) {
            realService.performAction();
        } else {
            throw new SecurityException("Forbidden");
        }
    }

    // 模拟获取当前用户的方法
    private User getCurrentUser() {
        // 在实际应用中，这里可以是从上下文或会话中获取用户信息
        return new User("user", false);
    }

    public static class User {
        private final String username;
        private final boolean isRoot;

        public User(String username, boolean isRoot) {
            this.username = username;
            this.isRoot = isRoot;
        }

        public boolean isRoot() {
            return isRoot;
        }
    }

}
