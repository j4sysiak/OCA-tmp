package com.udayan.oca.modyfikatory_dostepu.p2;


import com.udayan.oca.modyfikatory_dostepu.p1.Acc;

public class Test extends Acc {

    public static void main (String[] args)  {

        Acc obj = new Test();
        int x = obj.pub;

        x = obj.prot;  //'prot' has protected access in 'com.udayan.oca.p1.Acc'  - może być dostępny z obj ale musi być cast'owany
        x = ((Test) obj).prot;

        x = ((Test) obj).def;  //'def' is not public in 'com.udayan.oca.p1.Acc'. Cannot be accessed from outside package
        x = ((Test) obj).priv; //'priv' has private access in 'com.udayan.oca.p1.Acc'

        System.out.println("ssssssssssssssssss");
    }


}