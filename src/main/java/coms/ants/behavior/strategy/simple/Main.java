package coms.ants.behavior.strategy.simple;

public class Main {
    public static void main(String[] args) {
        IStrategy student = new StudentStrategy();
        Context context = new Context(student,100);
        System.out.println(context.getMethod());

        IStrategy child = new ChildStrategy();
        context = new Context(child,100);
        System.out.println(context.getMethod());
    }
}
