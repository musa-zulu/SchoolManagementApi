package com.thesoftwaredude.schoolmanagementapi.common;

import java.time.OffsetDateTime;

public interface IAuditable {
    public OffsetDateTime createdDate = OffsetDateTime.now();
    public OffsetDateTime updatedDate = OffsetDateTime.now();
    public String createdBy = "";
    public String updatedBy = ""; 
}
