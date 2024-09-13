package com.github.simplemocks.storage.api.rs;

import com.github.simplemocks.common.api.dto.ErrorRsDto;
import com.github.simplemocks.common.api.rs.StandardBodyRs;
import com.github.simplemocks.storage.api.dto.BucketFile;
import jakarta.annotation.Nonnull;

/**
 * Get bucket file response
 *
 * @author sibmaks
 * @since 0.0.11
 */
public class GetBucketFileRs extends StandardBodyRs<BucketFile> {

    /**
     * Construct get bucket file response
     *
     * @param bucketFile bucket file
     */
    public GetBucketFileRs(@Nonnull BucketFile bucketFile) {
        super(bucketFile);
    }

    /**
     * Construct get bucket file description response with error
     *
     * @param error happened error
     */
    public GetBucketFileRs(@Nonnull ErrorRsDto error) {
        super(error);
    }
}
