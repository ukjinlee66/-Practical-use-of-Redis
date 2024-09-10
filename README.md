# Practical-use-of-Redis



## Hexagonal Architecture

![img](https://miro.medium.com/v2/resize:fit:700/1*JOSyX8Ck85HrJ2WhU_jMcQ.png)

## Redis 활용



### 0. Cache Aside Pattern

---

### Cache Miss



```sequence
SpringBoot->MySQL: request
Note right of MySQL: Cache Miss
MySQL->SpringBoot: response
MySQL->Redis: Cache Write
```

### Cache Hit

```sequence
SpringBoot->Redis: request
Note right of Redis: Cache Hit
Redis->SpringBoot: response
```

### 1. Bulk Loading



### 2. Distributed locks





---



## Stack

Java 17, Gradle, Redis, JPA, Mybatis





