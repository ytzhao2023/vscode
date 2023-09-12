class Settings():
    """the class stores all the settings in the game "Alien Invasion" """
    def __init__(self):
        # settings of screen
        self.screen_width = 1200
        self.screen_height = 800
        self.bg_color = (230, 230, 230)
        
        # settings of the ship
        self.ship_speed_factor = 1.5
        self.ship_limit = 3

        # settings of bullets
        self.bullet_speed_factor = 3
        self.bullet_width = 3
        self.bullet_height = 15
        self.bullet_color = 60, 60, 60
        self.bullets_allowed = 3

        # settings of aliens
        self.alien_speed_factor = 1
        self.fleet_drop_speed = 10
        #  fleet_direction = 1 mean move right, fleet_direction = -1 mean move left
        self.fleet_direction = 1

