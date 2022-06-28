package Domaci26_05_;

import java.util.ArrayList;
import java.util.Scanner;

public class MainKlasa {
    public static void main(String[] args) {
        //Main klasa sadrzi ArrrayList<Pitanje> pitanja popuniti listu sa 5 pitanja.
        //Koristeci petlju proci kroz  ovih 5 pitanja i odgovoriti na jedno po jedno  pitanje.
        //Drugom petljom proci kroz ovih 5 pitanja i dodeliti bodove za odgovore, istovremeno beleziti
        //sumu osvojenih poena//


        ArrayList<String> listaPitanja=new ArrayList<>(5);
          listaPitanja.add("Koji je glavni grad Srbije?");
          listaPitanja.add("Koja je najduza reka u Evropi");
          listaPitanja.add("Kako se zove mladunce ovce?");
          listaPitanja.add("kako se zove mladumce krave?");
          listaPitanja.add("kako se zove mladunce patke?");

          ArrayList<String>listaOdgovora=new ArrayList<>();
          ArrayList<String>listaTacniOdgovori=new ArrayList<>();

          listaTacniOdgovori.add(0,"Beograd");
          listaTacniOdgovori.add(1,"Dunav");
          listaTacniOdgovori.add(2,"jagnje");
          listaTacniOdgovori.add(3,"tele");
          listaTacniOdgovori.add(4,"pace");
          int bod=0;


          for(int i=0; i< listaPitanja.size(); i++) {
              System.out.println(listaPitanja.get(i));
              Scanner sc=new Scanner(System.in);
              System.out.println("Odgovor na pitanje:");
              String odgovor=sc.next();
              listaOdgovora.add(odgovor);
          }

          for(int i=0; i<5; i++){
              String x=listaOdgovora.get(i);
              String y=listaTacniOdgovori.get(i);
              if(x.equals(y)){
                  bod=bod+1;
              }



          }

        System.out.println("Broj osvojenih bodova je: " +bod);

    }
}
