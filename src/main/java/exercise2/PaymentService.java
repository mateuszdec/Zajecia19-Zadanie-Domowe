package exercise2;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class PaymentService {

    private PaymentRepository paymentRepository;
    private DateTimeProvider dateTimeProvider;

    PaymentService(PaymentRepository paymentRepository, DateTimeProvider dateTimeProvider) {
        this.paymentRepository = paymentRepository;
        this.dateTimeProvider = dateTimeProvider;
    }

    List<Payment> findPaymentsSortedByDateDesc() {
        List<Payment> payments = new ArrayList<>();
        paymentRepository.findAll().stream()
//                .filter(payment -> payment.getPaymentDate().getYear() == dateTimeProvider.yearMonthNow().getYear())
//                .filter(payment -> payment.getPaymentDate().getMonth().equals(dateTimeProvider.yearMonthNow().getMonth()))
                .forEach(payment -> payments.add(payment));
        return payments;
    }

    List<Payment> findPaymentsForCurrentMonth() {
        List<Payment> payments = new ArrayList<>();
        paymentRepository.findAll().stream()
                .filter(payment -> payment.getPaymentDate().getYear() == dateTimeProvider.yearMonthNow().getYear())
                .filter(payment -> payment.getPaymentDate().getMonth().equals(dateTimeProvider.yearMonthNow().getMonth()))
                .forEach(payment -> payments.add(payment));
        return payments;
    }

    List<Payment> findPaymentsForGivenMonth(YearMonth yearMonth) {
        List<Payment> payments = new ArrayList<>();
        paymentRepository.findAll().stream()
                .filter(payment -> payment.getPaymentDate().getYear() == yearMonth.getYear())
                .filter(payment -> payment.getPaymentDate().getMonth().equals(yearMonth.getMonth()))
                .forEach(payment -> payments.add(payment));
        return payments;
    }

    List<Payment> findPaymentsForGivenLastDays(int days) {
        throw new RuntimeException("Not implemented");

    }

    Set<Payment> findPaymentsWithOnePaymentItem() {
        Set<Payment> payments = new HashSet<>();
        paymentRepository.findAll().stream()
                .filter(payment -> payment.getPaymentItems().size() == 1)
                .forEach(payment -> payments.add(payment));
        return payments;
    }

    Set<String> findProductsSoldInCurrentMonth() {
        throw new RuntimeException("Not implemented");
    }

    BigDecimal sumTotalForGivenMonth(YearMonth yearMonth) {
        throw new RuntimeException("Not implemented");
    }

    BigDecimal sumDiscountForGivenMonth(YearMonth yearMonth) {
        throw new RuntimeException("Not implemented");
    }

    List<PaymentItem> getPaymentsForUserWithEmail(String userEmail) {
        throw new RuntimeException("Not implemented");
    }

    Set<Payment> findPaymentsWithValueOver(int value) {
        throw new RuntimeException("Not implemented");
    }

}
