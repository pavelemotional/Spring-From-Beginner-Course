package spring_introduction.xml_configuration.entities;


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
