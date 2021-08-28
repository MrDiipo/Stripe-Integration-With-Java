import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;

import java.util.HashMap;
import java.util.Map;

public class StripeApp {

    public static void main(String[] args) throws StripeException {
        Stripe.apiKey = "sk_test_51JSnBpFQmi5soo6jm1VPHoirOPbYLoH6nD2whpoc0OTv8DmYYtzWSZqlsRDuQsMJ7OdyZ4rECvPkvMMtjF3msJ17006uPtmM5r";

//        Map<String, Object> customerParameter = new HashMap<String, Object>();
//        customerParameter.put("email", "elegbedesubomi@gmail.com");

//        Customer newCustomer = Customer.create(customerParameter);

        Customer a = Customer.retrieve("cus_K7m83jddYXLErA");

    }
}
