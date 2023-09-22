import matplotlib.pyplot as plt
from random_walk import RandomWalk

# Keep randow walking whenever the program is active.
while True:
    # Set an instance of RandomWalk, and draw its points.
    rw = RandomWalk()
    rw.fill_walk()

    # Set the size of the drawing screen.
    plt.figure(dpi = 128, figsize = (10, 6))

    point_numbers = list(range(rw.num_points))
    plt.scatter(rw.x_values, rw.y_values, c = point_numbers, 
        cmap = plt.cm.Blues, edgecolor = "none", s = 15)
    
    # Highlight the beginning and ending.
    plt.scatter(0, 0, c = "green", edgecolors = "none", s = 100)
    plt.scatter(rw.x_values[-1], rw.y_values[-1], c = "red", 
        edgecolors = "none", s = 100)
    
    # Hide the axes.
    plt.gca().get_xaxis().set_visible(False)
    plt.gca().get_yaxis().set_visible(False)

    plt.axis("off")
    
    plt.show()

    # keep_running = input("Make another walk?(y/n):")
    if keep_running == "n":
        break