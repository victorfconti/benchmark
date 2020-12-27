from __future__ import annotations
import names
import random


class Person:

    def __init__(self):
        self.name: str = ''
        self.age: int = 0
        self.score: int = 0

    @staticmethod
    def generate_random_person() -> Person:
        person = Person()
        person.name = names.get_full_name()
        person.age = random.randrange(100)
        person.score = random.randrange(100)
        return person
