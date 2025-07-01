package com.hit.demo.infrastructure.storage.adapter;

import com.hit.demo.shared.storage.StorageCommand;
import com.hit.storage.config.StorageFileConfig;
import com.hit.storage.impl.MinioStorageCommandImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MinioStorageCommandAdapter extends MinioStorageCommandImpl implements StorageCommand {

    public MinioStorageCommandAdapter(StorageFileConfig config) {
        super(config);
    }

}
