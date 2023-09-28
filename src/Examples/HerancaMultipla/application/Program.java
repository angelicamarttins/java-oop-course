package Examples.HerancaMultipla.application;

import Examples.HerancaMultipla.model.entities.ComboDevice;
import Examples.HerancaMultipla.model.entities.ConcretePrinter;
import Examples.HerancaMultipla.model.entities.ConcreteScan;

public class Program {
  public static void main(String[] args) {
    ConcretePrinter concretePrinter = new ConcretePrinter("Angélica");
    ConcreteScan concreteScan = new ConcreteScan("Mayara");
    ComboDevice comboDevice = new ComboDevice("Caetano");

    System.out.println(concretePrinter.print("Martins"));
    concretePrinter.processDoc("Martins");

    System.out.println();
    System.out.println(concreteScan.scan());
    concreteScan.processDoc("Letícia");

    System.out.println();
    System.out.println(comboDevice.print("Martins"));
    System.out.println(comboDevice.scan());
    comboDevice.processDoc("da Silva");
  }
}
