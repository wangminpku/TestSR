package cn.edu.pku.sei;

public class C extends B1 {

    public int c;
    public String c1;

    public void m2(){
        System.out.println("I am a test method for override");
    }

    @Override
    public void m1(){
        System.out.println(s);
    }


    public void m3()
    {
        D d = new D();
        String val = d.getVar2();
        System.out.println(val);
        //System.out.println(s);
    }
}
