package qikserve.challenge.checkout.dto;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@Validated
public class BasketItemRequest {

    @Valid
    @NotNull(message = "product must not be null!")
    private ProductRequest product;

    private Integer quantity;

}
