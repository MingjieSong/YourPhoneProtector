package paymentprocessing;
import javax.json.Json;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("credit-card-processing")
public class CreditCardProcessingService {
	@POST
	@Path("/payment")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response submitCreditCard(String jsonOrder) {
		//FIXME
		String paymentConfirmationNum = "123456" ;
		return Response.ok("1111").entity(paymentConfirmationNum).build();
	}	

}
