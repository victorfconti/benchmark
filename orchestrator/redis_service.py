from __future__ import annotations

from typing import List

from person import Person
from redis import Redis

import simplejson as json


class RedisService:

    def __init__(self, host, port, db):
        self.r = Redis(host=host, port=port, db=db)
        print('Connection opened')

    def populate(self):
        persons: List[str] = RedisService.create_persons()
        print('Inserting values')
        self.r.lpush('persons', *persons)

    @staticmethod
    def create_persons() -> List[str]:
        print('Generating values')
        persons: List[Person] = [Person.generate_random_person() for _ in range(0, 10_000)]
        return list(map(lambda p: json.dumps(p, default=lambda x: vars(x)), persons))

    def __del__(self):
        self.r.close()
        print('Connection closed')
