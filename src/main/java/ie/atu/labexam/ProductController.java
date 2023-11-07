package ie.atu.labexam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductController {
    private ProductServiceClient productServiceClient;
    private final AcknowledgeService acknowledgeService;

    @Autowired
    public ProductController(AcknowledgeService acknowledgeService,
                             ProductServiceClient productServiceClient) {

        this.acknowledgeService = acknowledgeService;
        this.productServiceClient = productServiceClient;
    }
    @PostMapping("/confirm-and-register")
    public Map<String, String> confirmAndRegister(@RequestBody ProductDetails productDetails) {
        String confirm = productServiceClient.someDetails(productDetails);
        Map<String, String> productMessage = new HashMap<>();
        productMessage.put("productId" + productDetails.getProductId() + "productName",
                "{name}" + "quantity" + productDetails.getQuantity() +
                        "warehouseId" + productDetails.getWarehouseId());
        return productMessage;
    }
}
