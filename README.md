## Core lib
- Core lib là phần base và tích hợp thư viện sử dụng chung cho toàn bộ dự án
- Nếu dùng cho 1 dự án có thể để trong 1 module core lib
- Nếu dùng cho nhiều dự án cần đẩy nó lên repo hub (public/private) 

### Build core lib
```shell
cd .\hit-core-lib\
mvn clean install
```

### Mô hình kiến trúc project
I. Các Layer Architecture
- Chi tiết [Document](./wdocument/layer-architecture.puml)
```
src/
├── shared/                         # Shared Layer
│   ├── interfaces/
│   │   ├── ICacheService.java
│   │   ├── IMessagePublisher.java
│   │   └── IEmailService.java
│   ├── utils/
│   │   ├── DateUtils.java
│   │   └── ValidationUtils.java
│   └── exceptions/
│       ├── BaseException.java
│       ├── ValidationException.java
│       └── BusinessException.java
│
├── domain/                         # Can import from shared
│   ├── entities/
│   ├── services/
│   ├── rules/
│   └── store/                      # Business-specific only
│       ├── IMovieStore.java
│       └── IUserStore.java
│
├── core/                           # Can import from shared + domain
│   ├── use-cases/
│   └── services/
│
├── ui/                            # Can import from core
└── infrastructure/                # Can import from domain/shared
    └── implementations/
        ├── RedisCache.java           # implements shared/ICacheService
        ├── RabbitMQPublisher.java    # implements shared/IMessagePublisher
        └── DatabaseMovieStore.java   # implements domain/IMovieStore
```

