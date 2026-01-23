import java.util.ArrayList;

public class ArrayWrapper {
    public ArrayList<Integer> list;

    public ArrayWrapper(ArrayList<Integer> list) {
        this.list = list;
    }

    public int pocet( Func1 func) {
        int pocet = 0;
        for (int i : list) {
            if (func.countIf(i)){
                pocet++;
            }
        }
        return pocet;
    }

    public int maxBy( Func2 func) {
        int maxNeco = list.getFirst();
        int max = list.getFirst();
        for (int i : list) {
            if (func.maxNeco(i) > maxNeco){
                maxNeco = func.maxNeco(i);
                max = i;
            }
        }
        return max;
    }

    public ArrayList<Integer> whileIdk(Func3 func) {
        ArrayList<Integer> idk = new ArrayList<>();
        for (int i : list) {
            if (func.idk(i)){
                idk.add(i);
            }
            else {
                break;
            }
        }
        return idk;
    }
}
