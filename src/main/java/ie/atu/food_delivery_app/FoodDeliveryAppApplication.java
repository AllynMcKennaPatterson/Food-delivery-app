package ie.atu.food_delivery_app;

import ie.atu.food_delivery_app.customer.CustomerEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class FoodDeliveryAppApplication {
	@Autowired
	private CustomerEmailService senderService;

	public static void main(String[] args) {
		SpringApplication.run(FoodDeliveryAppApplication.class, args);
	}
 //test
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		senderService.sendEmail("deniscostello309@gmail.com", "Order", "Delivery driver on their way");
	}

}
