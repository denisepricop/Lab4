public class P2 {
    public static void main(String[] args) {
        System.out.println("sdjghkd");

        int [] arrayDeIntregi={56,65,67,89,4,23,1,11}; // am declarat si initializat cu 8 valori
        int gaina= arrayDeIntregi[0];
        for(int i=1;i<arrayDeIntregi.length;i++) {
            if(gaina<arrayDeIntregi[i])
                gaina=arrayDeIntregi[i];
        }


//               int [] altArray = new int[8]; // am declarat un array de 8 valori intregi dar nu am pus valorile
//
//        altArray[4]=66;
//        altArray[5]=55;
//
//        for (int i=0;i<altArray.length;i++) {
//            System.out.println(altArray[i]);
//        }
//
//        System.out.println(arrayDeIntregi.length);
//
//        arrayDeIntregi[0] // primul element din array
//        arrayDeIntregi[arrayDeIntregi.length-1] // ultimul din array
//
//        for (int i=0; i<arrayDeIntregi.length;i++) {
//            System.out.println(arrayDeIntregi[i]);
//        }
//
//
//        int primulNr=670;
//        int alDoileaNr=6666;
//        int alTreileaNumar=100;
//
//        int maxim=primulNr; // el aici nu are valoare
//
//
//
//        if(primulNr>alDoileaNr && primulNr>alTreileaNumar) {
//          maxim=primulNr;
//        }
//          else
//              if(alDoileaNr>alTreileaNumar)
//            maxim = alDoileaNr;
//        }
//        else
//    { ma
//
//        // afisez maximul
//        System.out.println(maxim);
  }
}
