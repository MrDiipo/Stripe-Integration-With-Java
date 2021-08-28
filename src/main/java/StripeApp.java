import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.Token;
import com.stripe.param.CustomerRetrieveParams;

import java.util.HashMap;
import java.util.Map;

public class StripeApp {

    public static void main(String[] args) throws StripeException {
        Stripe.apiKey = "sk_test_51JSnBpFQmi5soo6jm1VPHoirOPbYLoH6nD2whpoc0OTv8DmYYtzWSZqlsRDuQsMJ7OdyZ4rECvPkvMMtjF3msJ17006uPtmM5r";

//        Map<String, Object> customerParameter = new HashMap<String, Object>();
//        customerParameter.put("email", "elegbedesubomi@gmail.com");

//        Customer newCustomer = Customer.create(customerParameter);

        CustomerRetrieveParams params = CustomerRetrieveParams.builder().addExpand("sources").build();
        Customer a = Customer.retrieve("cus_K7m83jddYXLErA", params, null);

        Map<String, Object> cardParameter = new HashMap<String, Object>();
        cardParameter.put("number", "4242424242424242");
        cardParameter.put("exp_month", "11");
        cardParameter.put("exp_year", "2022");
        cardParameter.put("cvc", "123");

        Map<String, Object> tokenParam = new HashMap<String, Object>();
        tokenParam.put("card", cardParameter);

        Token token = Token.create(tokenParam);

        Map<String, Object> source = new HashMap<String, Object>();
        source.put("source", token.getId());

        a.getSources().create(source);
    }
}
