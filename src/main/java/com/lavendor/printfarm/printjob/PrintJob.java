package com.lavendor.printfarm.printjob;

import com.lavendor.printfarm.order.Order;
import com.lavendor.printfarm.printer.Printer;
import com.lavendor.printfarm.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "printjobs")
public class PrintJob {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "printer_id")
    private Printer printer;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;  // Direct reference to the orderId instead of Order entity

    private PrintJobStatus printJobStatus;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

}
