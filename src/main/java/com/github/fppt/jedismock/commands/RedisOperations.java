package com.github.fppt.jedismock.commands;

/**
 * Lists all operations which affects the {@link com.github.fppt.jedismock.RedisBase} with no side effects.
 * This can be thought of as simple atomic operations.
 */
public enum RedisOperations {
    SET,
    SETEX,
    PSETEX,
    SETNX,
    SETBIT,
    APPEND,
    GET,
    GETBIT,
    TTL,
    PTTL,
    EXPIRE,
    PEXPIRE,
    INCR,
    INCRBY,
    DECR,
    DECRBY,
    PFCOUNT,
    PFADD,
    PFMERGE,
    MGET,
    MSET,
    GETSET,
    STRLEN,
    DEL,
    EXISTS,
    EXPIREAT,
    PEXPIREAT,
    LPUSH,
    RPUSH,
    LPUSHX,
    LRANGE,
    LLEN,
    LPOP,
    RPOP,
    LINDEX,
    RPOPLPUSH,
    BRPOPLPUSH,
    SUBSCRIBE,
    UNSUBSCRIBE,
    PUBLISH,
    FLUSHALL,
    LREM,
    QUIT,
    EXEC,
    PING,
    KEYS,
    SADD,
    SPOP,
    HGET,
    HSET,
    HDEL,
    HGETALL,
    SINTER,
    HMGET,
    HMSET,
    SMEMBERS,
    MULTI,
    SELECT;
}
