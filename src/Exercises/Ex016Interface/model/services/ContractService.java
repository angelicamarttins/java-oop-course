package Exercises.Ex016Interface.model.services;

import Exercises.Ex016Interface.model.entities.Contract;
import Exercises.Ex016Interface.model.entities.Installment;

public class ContractService {
  private OnlinePaymentService onlinePaymentService;

  public ContractService() {
  }

  public ContractService(OnlinePaymentService onlinePaymentService) {
    this.onlinePaymentService = onlinePaymentService;
  }

  public void processContract(Contract contract, Integer months) {
    Double installments = contract.getTotalValue() / months;

    for (int i = 1; i <= months; i++) {
      Double interest = onlinePaymentService.interest(installments, i);
      Double paymentFee = onlinePaymentService.paymentFee(installments + interest);
      Double totalInstallment = installments + interest + paymentFee;

      Installment installment = new Installment(contract.getDate().plusMonths(i), totalInstallment);
      contract.getInstallments().add(installment);
    }
  }
}
