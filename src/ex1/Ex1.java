package ex1;

import java.lang.management.ManagementFactory;

public class Ex1 {

   public static void main(String args[]) {
       String os = System.getProperty("os.name");
       System.out.println(os);



       int mb = 1024*1024;
       long memorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory
               .getOperatingSystemMXBean()).getTotalMemorySize()/mb;
       long memoryFree = ((com.sun.management.OperatingSystemMXBean) ManagementFactory
               .getOperatingSystemMXBean()).getFreeMemorySize()/mb;

       System.out.println("Capacidade de memória RAM: "+ memorySize + "mb") ;
       System.out.println("Memória RAM alocada: "+ (memorySize - memoryFree) + "mb") ;
       System.out.println("Memória RAM livre: " + memoryFree + "mb");




   }
}
