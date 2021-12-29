package spring_introduction.java_code_configuration_ex1.entities;


public interface Pet {
    public default void say() {
        System.out.println(this.getClass().getSimpleName() + " say:");
    }

    public default void init() {
        System.out.println(this.getClass().getSimpleName() + " bean is initialized");
    }

    public default void destroy() {
        System.out.println(this.getClass().getSimpleName() + " bean destroyed");
    }

}
