package cn.edu.pku.sei;

public class C extends B1 {

    public int c;
    public String c1;

    public void m2(){
        System.out.println("I am a test method for override");
    }

    public void m2(String s)
    {
       /* D d = new D();
        String val = d.getVar1();*/
        System.out.println(s);
        //System.out.println(s);
    }
}
