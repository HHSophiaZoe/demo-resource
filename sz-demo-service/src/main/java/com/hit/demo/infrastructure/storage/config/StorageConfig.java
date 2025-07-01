package com.hit.demo.infrastructure.storage.config;

import com.hit.demo.shared.storage.StorageCommand;
import com.hit.demo.infrastructure.storage.adapter.FtpStorageCommandAdapter;
import com.hit.demo.infrastructure.storage.adapter.MinioStorageCommandAdapter;
import com.hit.demo.infrastructure.storage.adapter.SftpStorageCommandAdapter;
import com.hit.storage.config.StorageFileConfig;
import com.hit.storage.constant.StorageEnum;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ObjectUtils;

@Configuration
public class StorageConfig {

    public StorageCommand getStorage(StorageFileConfig config) {
        if (ObjectUtils.isEmpty(config)) {
            throw new IllegalArgumentException("Storage File Config required");
        }
        return switch (config.getStorage()) {
            case StorageEnum.FTP -> new FtpStorageCommandAdapter(config);
            case StorageEnum.SFTP -> new SftpStorageCommandAdapter(config);
            case StorageEnum.MINIO -> new MinioStorageCommandAdapter(config);
        };
    }

}
