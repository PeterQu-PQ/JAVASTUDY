//：java/VarArgs
//To konw about VarArgs
public class VarArgs {
    static void printArray(Object... args){
        for (Object obj:args){
            System.out.print(obj+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(1,2,"a","haha");
        printArray(new Integer(1),new Character('A'),new Float(1.2));
    }
}
