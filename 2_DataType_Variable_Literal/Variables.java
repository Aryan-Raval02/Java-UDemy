public class Variables {
    public static void main(String[] args) {
        byte b = 120;
        //b = 128 ; error : possible lossy conversion int to byte
        System.out.println(b);
        short s = 300;
        int i = 214748;
        Character c = 'A';

        int x = 0b10101010; // binary form
        int y = 012; // Octal form
        int z = 0XA;
        System.out.println(x+".."+y +".."+z);

    }
}
