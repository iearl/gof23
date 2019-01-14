package coms.ants.behavior.strategy.context;

public class Main {
    public static void main(String[] args) {
        IStrategy student = new StudentStrategy();
        Context context = new Context(student,100);
        System.out.println(context.getMethod());

        IStrategy child = new ChildStrategy();
        context = new Context(child,100);
        System.out.println(context.getMethod());

        IStrategy temp = new TempIStrategy();
        context = new TempContext(temp,100,"123");
        System.out.println(context.getMethod());
    }
}
