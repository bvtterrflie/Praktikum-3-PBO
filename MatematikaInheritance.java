package math;

public class MatematikaInheritance {
    public static void main(String[] args) {
        // Create object of Matematika2 which inherits Matematika
        Matematika2 math = new Matematika2();

        // Calling methods from Matematika
        System.out.println("Tambah: " + math.tambah(10, 5));
        System.out.println("Kurang: " + math.kurang(10, 5));
        System.out.println("Kali: " + math.kali(10, 5));
        System.out.println("Bagi: " + math.bagi(10, 5));

        // Calling the modulus method from Matematika2
        System.out.println("Modulus: " + math.modulus(10, 5));
    }
}