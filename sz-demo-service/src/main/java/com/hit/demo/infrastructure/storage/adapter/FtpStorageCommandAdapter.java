package com.hit.demo.infrastructure.storage.adapter;

import com.hit.demo.shared.storage.StorageCommand;
import com.hit.storage.config.StorageFileConfig;
import com.hit.storage.impl.FtpStorageCommandImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FtpStorageCommandAdapter extends FtpStorageCommandImpl implements StorageCommand {

    public FtpStorageCommandAdapter(StorageFileConfig config) {
        super(config);
    }

}
