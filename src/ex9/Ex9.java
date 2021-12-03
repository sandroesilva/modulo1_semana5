package ex9;



public class Ex9 {
    static{
        System.out.println("dentro do bloco static");
    }

    Ex9() {
        System.out.println("dentro do contructor");
    }
    {
        System.out.println("dentro do bloco de intancia");
    }

//  Coloquei fora de ordem pq sempre ira excutar static, intance, constructor


    public static void main(String args[]){
        new Ex9();
    }
}
