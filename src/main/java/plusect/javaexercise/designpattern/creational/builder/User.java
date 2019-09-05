package plusect.javaexercise.designpattern.creational.builder;

/**
 * 建造者模式
 * 核心是：先把所有的属性都设置给 Builder，然后 builder() 方法的时候，将这些属性复制给实际产生的对象
 */
public class User {
    // 下面是“一堆”的属性
    private String username;
    private String password;
    private int age;

    // 构造方法私有化，不然客户端就会直接调用构造方法了
    private User(String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    // 静态方法，用于生成一个 Builder，这个不一定要有，不过写这个方法是一个很好的习惯，
    // 有些代码要求别人写 new User.UserBuilder().a()...builder() 看上去就没那么好
    public static UserBuilder builder(){
        return new UserBuilder();
    }

    public static class UserBuilder {
        // 下面是和 User 一模一样的一堆属性
        private String username;
        private String password;
        private int age;

        private UserBuilder() {
        }

        // 链式调用设置各个属性值，返回 this，即 UserBuilder
        public UserBuilder username(String username){
            this.username = username;
            return this;
        }

        public UserBuilder password(String password){
            this.password = password;
            return this;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        // builder() 方法负责将 UserBuilder 中设置好的属性“复制”到 User 中。
        // 当然，可以在 “复制” 之前做点检验
        public User build(){
            if (username == null || password == null) {
                throw new RuntimeException("用户名和密码必填");
            }
            if (age <= 0 || age >= 150) {
                throw new RuntimeException("年龄不合法");
            }
            // 还可以做赋予”默认值“的功能
            if (password == null) {
                password = username;
            }

            return new User(username, password, age);
        }
    }
}
