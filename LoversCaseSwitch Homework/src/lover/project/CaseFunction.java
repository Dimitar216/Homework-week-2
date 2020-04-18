package lover.project;

public class CaseFunction {
    public static void main(String[] args){
        casefunction();
    }
    public static void casefunction(){
        int floorNumber = 1;
        String nameOfPerson = "Default value";
        switch (floorNumber){
            case 0:
                System.out.println("Ouch");
                break;
            case 1:
                System.out.println("Hello Trump");
                break;
            case 2:
                System.out.println("Hello Jeff");
                break;
            case 3:
                System.out.println("Hello Bernie");
                break;
            case 4:
                System.out.println("Hello Felix");
                break;
            case 5:
                System.out.println("Hello Tyrone");
                break;
            case 6:
                System.out.println("Hello Morty");
                break;
            case 7:
                System.out.println("Hello Rick");
                break;
            case 8:
                System.out.println("Hello Jake");
                break;
            case 9:
                System.out.println("Hello Finn");
                break;
            default:
                System.out.println("Invalid Floor");
                break;
        }

    }
}
