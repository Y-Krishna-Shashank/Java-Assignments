public class ImplementationClass implements CombinedInterface {
    @Override
    public void g() {
        System.out.println("Method g() of combined interface");
    }

    @Override
    public void a() {
        System.out.println("Method a() of interface one");
    }

    @Override
    public void b() {
        System.out.println("Method b() of interface one");

    }

    @Override
    public void e() {
        System.out.println("Method e() of interface three");
    }

    @Override
    public void f() {
        System.out.println("Method f() of interface three");
    }

    @Override
    public void c() {
        System.out.println("Method c() of interface two");
    }

    @Override
    public void d() {
        System.out.println("Method d() of interface two");
    }

    public void h(Interface_one interface_one)
    {
        System.out.println("In method h() taking Interface_one as a argument");

    }
    public void i(Interface_two interface_two)
    {
        System.out.println("In method i() taking Interface_two as a argument");
    }
    public void j(Interface_three interface_three)
    {
        System.out.println("In method j() taking interface_three as a argument");
    }
    public void k(CombinedInterface combinedInterface)
    {
        System.out.println("In method k() taking combined interface as a argument");
    }
}
