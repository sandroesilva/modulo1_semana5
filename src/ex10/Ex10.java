package ex10;

public class Ex10 {
    public class ClasseInterna{
            public void print(){
                System.out.println("Instanciado a classe interna");
            }
    }

    public static class ClasseInternaStatic{
        public void print(){
            System.out.println("Instanciado a classe interna static");
        }

    }
    void instanceClasseInternaLocal(){
        class ClasseInternaLocal{
            public void print(){
                System.out.println("Instanciado a classe interna local");
            }
        }
        ClasseInternaLocal cil = new ClasseInternaLocal();
        cil.print();
    }
    abstract class ClasseInternaAnonima{
        public abstract void print();
    }
    public static void  main(String[] args){
//      Instanciando classe interna
        Ex10 cei = new Ex10();
        ClasseInterna ci = cei.new ClasseInterna();
        ci.print();

//      Instanciando classe interna static
        Ex10.ClasseInternaStatic cis = new Ex10.ClasseInternaStatic();
        cis.print();

//      Instanciando classe interna local
        Ex10 cil = new Ex10();
        cil.instanceClasseInternaLocal();

//      Intanciando classe interna anonima
        Ex10 ceia = new Ex10();
        ClasseInternaAnonima cia = ceia.new ClasseInternaAnonima() {
            public void print(){
                System.out.println("Instanciado a classe interna anonima");
            }
        };
        cia.print();
    }
}
