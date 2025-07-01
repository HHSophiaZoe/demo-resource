package com.hit.demo.infrastructure.storage.adapter;

import com.hit.demo.shared.storage.StorageCommand;
import com.hit.storage.config.StorageFileConfig;
import com.hit.storage.impl.SftpStorageCommandImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SftpStorageCommandAdapter extends SftpStorageCommandImpl implements StorageCommand {

    public SftpStorageCommandAdapter(StorageFileConfig config) {
        super(config);
    }

}
