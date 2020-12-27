from redis_service import RedisService

redis_service = RedisService(host='localhost', port=6379, db=0)

redis_service.populate()

del redis_service
