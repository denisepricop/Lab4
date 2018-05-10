public class CitTast {
    public static void main(String[] args) {
        // se citeste un numar si se afiseaza patratul folosind clasa SkeletonJava a lui Ionel

        //citirea
        int nrIntrare=-1;

        nrIntrare = SkeletonJava.readIntConsole("da un numar mai bade:");
        while (nrIntrare!=0) {

            //algoritm
            int rezultat = nrIntrare * nrIntrare;

            //afisarea
            SkeletonJava.printConsole(rezultat);
            nrIntrare = SkeletonJava.readIntConsole("da un numar mai bade:");
        }
    }
}

