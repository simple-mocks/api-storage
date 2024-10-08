package com.github.sibdevtools.storage.api.rs;

import com.github.sibdevtools.common.api.dto.ErrorRsDto;
import com.github.sibdevtools.common.api.rs.StandardBodyRs;
import jakarta.annotation.Nonnull;

/**
 * Save file response
 *
 * @author sibmaks
 * @since 0.0.11
 */
public class SaveFileRs extends StandardBodyRs<String> {

    /**
     * Construct save files response
     *
     * @param bucketFileId bucket file identifier
     */
    public SaveFileRs(@Nonnull String bucketFileId) {
        super(bucketFileId);
    }

    /**
     * Construct save files response with error
     *
     * @param error happened error
     */
    public SaveFileRs(@Nonnull ErrorRsDto error) {
        super(error);
    }
}
