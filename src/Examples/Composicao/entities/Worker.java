package Examples.Composicao.entities;

import Examples.Composicao.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Worker {
  private String name;
  private WorkerLevel level;
  private Double baseSalary;
  private Department department;
  private List<HourContract> contracts = new ArrayList<>();

  public Worker() {
  }

  public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
    this.name = name;
    this.level = level;
    this.baseSalary = baseSalary;
    this.department = department;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkerLevel getLevel() {
    return level;
  }

  public void setLevel(WorkerLevel level) {
    this.level = level;
  }

  public Double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public String getDepartment() {
    return department.getName();
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public List<HourContract> getContract() {
    return contracts;
  }
  public void addContract(HourContract contract) {
    contracts.add(contract);
  }

  public void removeContract(HourContract contract) {
    contracts.remove(contract);
  }

  public Double income(int year, int month) {
    double totalIncomes = 0F;

    List<HourContract> filteredContract =
        contracts
            .stream()
            .filter(contract ->
                contract.getDate().getYear() == year && contract.getDate().getMonthValue() == month
            )
            .collect(Collectors.toList());

    for (HourContract contract : filteredContract) {
      totalIncomes += contract.totalValue();
    }

    return totalIncomes + baseSalary;
  }
}
