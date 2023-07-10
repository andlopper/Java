package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Entre os dados do contrato: ");
        System.out.printf("Número: ");
        int number = sc.nextInt();
//        System.out.printf("Data (dd/MM/yyyy): ");
//        Date date = sdf.parse(sc.next());
        System.out.printf("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, totalValue);

        System.out.printf("Entre com o número de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, n);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
