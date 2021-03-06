package qikserve.challenge.checkout.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Promotion {

    private String id;

    private String name;

    private List<String> products;

    private PromotionDiscountTypes discountType;

    private Integer discount;
}
