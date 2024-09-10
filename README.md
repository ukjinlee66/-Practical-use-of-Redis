# Practical-use-of-Redis



## Hexagonal Architecture

![img](https://miro.medium.com/v2/resize:fit:700/1*JOSyX8Ck85HrJ2WhU_jMcQ.png)

## Redis 활용



### 0. Cache Aside Pattern

---

### Cache Miss



```mermaid
sequenceDiagram
SpringBoot->MySQL: request
Note right of MySQL: Cache Miss
MySQL->Redis: Cache Write
MySQL->SpringBoot: response
```

### Cache Hit

```mermaid
sequenceDiagram
SpringBoot->Redis: request
Note right of Redis: Cache Hit
Redis->SpringBoot: response
```

### 1. Bulk Loading



### 2. Distributed locks





---



## Stack

Java 17, Gradle, Redis, JPA, Mybatis





