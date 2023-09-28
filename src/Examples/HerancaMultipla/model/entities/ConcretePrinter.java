package Examples.HerancaMultipla.model.entities;

public class ConcretePrinter extends Device implements Printer{
  public ConcretePrinter(String serialNumber) {
    super(serialNumber);
  }

  @Override
  public void processDoc(String doc) {
    System.out.println("Print processing " + doc);
  }

  @Override
  public String print(String doc) {
    return "Printing: " + doc;
  }
}
