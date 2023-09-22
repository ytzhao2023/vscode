from random import randint

class Dice():
    """Set a dice class."""
    def __init__(self, num_sides = 6):
        """Supposed the dice has 6 sides."""
        self.num_sides = num_sides
    
    def roll(self):
        """Return a value between 1 and self.num_sides."""
        # Randint(x, y), x and y both in the range.
        return randint(1, self.num_sides)
        
    