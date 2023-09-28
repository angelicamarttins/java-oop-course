package Examples.HerancaMultipla.model.entities;

public class ConcreteScan extends Device implements Scanner {
  public ConcreteScan(String serialNumber) {
    super(serialNumber);
  }

  @Override
  public void processDoc(String doc) {
    System.out.println("Scan processing " + doc);
  }

  @Override
  public String scan() {
    return "Scan result";
  }
}
