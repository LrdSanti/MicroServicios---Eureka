package com.msvc.rating.rating_service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("rates")
public class Rating {

    @Id
    private String rateId;
    private String userId;
    private String hotelId;
    private int rate;
    private String remark;
}
