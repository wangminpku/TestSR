package cn.edu.pku.sei;

public class D implements AI{

    public String var2 = null;

    public String getVar2() {
        return var2;
    }

    public void setVar1(String var1) {
        this.var2 = var1;
    }

    public void UseVal(){
        System.out.println(var2);
    }

    public void m6() {
        System.out.println("I am a method implement a interface");
    }
}
