package com.storefront.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CasesStatusChangeEvent {

    @NonNull
    private String guid;

    @NonNull
    private CasesStatusEvent casesStatusEvent;

}
