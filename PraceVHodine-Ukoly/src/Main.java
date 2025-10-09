import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ukol[] ukoly = new Ukol[10];
        int[] isUkol = new int[10];
        for (int i = 0; i < ukoly.length; i++) {
            ukoly[i] = new Ukol();
            isUkol[i] = 0;
        }

        int indexNovehoUkolu = 0;
        ukoly[indexNovehoUkolu] = addUkol(sc);
        System.out.println("Pridali jste ukol: " + ukoly[indexNovehoUkolu].toString());
        isUkol[indexNovehoUkolu] = 1;

        boolean isProgramBezi = true;
        while (isProgramBezi) {
            System.out.println("Pro pridani ukolu stisknete 1, pro odstaneni ukolu 2");
            if (sc.nextLine().trim().equals("1")) {
                for (int i = 0; i < isUkol.length; i++) {
                    if (isUkol[i] == 0) {
                        indexNovehoUkolu = i;
                    }
                }
                ukoly[indexNovehoUkolu] = addUkol(sc);
                isUkol[indexNovehoUkolu] = 1;
            } else {
                System.out.println("Jaky ukol chcete odstranit (podle jmena): ");
                for (int i = 0; i < ukoly.length; i++) {
                    if (isUkol[i] == 1) {
                        System.out.println(ukoly[i].getJmeno());
                    }
                }
                String jmenoOdstraneni = (sc.nextLine()).trim();
                for (int i = 0; i < ukoly.length; i++) {
                    if (isUkol[i] == 1 && ukoly[i].getJmeno().equals(jmenoOdstraneni)) {
                        isUkol[i] = 0;
                        ukoly[i] = null;
                        System.out.println("Ukol jmenem " + jmenoOdstraneni + " byl odstranen");
                        break;
                    }
                }

            }
        }


    }

    public static Ukol addUkol(Scanner sc) {
        Ukol ukol = new Ukol();
        System.out.println("Pridejte ukol\nJmeno ukolu: ");
        ukol.setJmeno(sc.nextLine());
        System.out.println("Popisek ukolu: ");
        ukol.setPopisek(sc.nextLine());
        System.out.println("Autor ukolu: ");
        ukol.setAutor(sc.nextLine());
        System.out.println("Kdo ma ukol vyresit: ");
        ukol.setResitel(sc.nextLine());
        return ukol;
    }

}