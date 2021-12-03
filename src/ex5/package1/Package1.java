package ex5.package1;

import ex5.package2.Package2;

public class Package1 {
    public static void main(String[] args){
        Package2 pk2 = new Package2();
        System.out.println(pk2.callObject());
        System.out.println(Package2.callStatic());

    }
}
