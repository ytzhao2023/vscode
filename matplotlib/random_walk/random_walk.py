from random import choice

class RandomWalk():
    """Generate a random walk class."""
    def __init__(self, num_points = 5000):
        """Initialize attributes of the class."""
        self.num_points = num_points

        # Every rand walk starts with coordinate(0, 0).
        self.x_values = [0]
        self.y_values = [0]

    def fill_walk(self):
        """Calculate all the points generated by random walks."""

        # Keep random walking until reach to pointed length.
        while len(self.x_values) < self.num_points:

            # Choice[1, -1] decides the direction of X and Y.
            # Choice([0, 1, 2, 3, 4]) decides the distance of X and Y.
            x_direction = choice([1, -1])
            x_distance = choice([0, 1, 2, 3, 4])
            x_step = x_direction * x_distance

            y_direction = choice([1, -1])
            y_distance = choice([0, 1, 2, 3, 4])
            y_step = y_direction * y_distance

            # Reject to keep stopping.
            if x_step == 0 and y_step == 0:
                continue

            # Calculate the value of next points.
            next_x = self.x_values[-1] + x_step
            next_y = self.y_values[-1] + y_step

            self.x_values.append(next_x)
            self.y_values.append(next_y)