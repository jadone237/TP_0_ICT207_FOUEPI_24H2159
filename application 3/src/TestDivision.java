public class TestDivision {

    public static void main(String[] args) {


        Division d = new Division();
        System.out.println("Division instance : " + d.diviser(10, 2));


        System.out.println("Division statique : " + Division.diviserStatique(10, 2));
    }
}
