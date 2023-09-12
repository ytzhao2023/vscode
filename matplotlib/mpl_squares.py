import matplotlib.pyplot as plt

squares = [1, 4, 9, 16, 25]
plt.plot(squares, linewidth = 5)

# Setting the title of the diagram, and adding labels to the coordinate axis.
plt.title("Square Numbers", fontsize = 24)
plt.xlabel("value", fontsize = 14)
plt.ylabel("Square of Value", fontsize = 14)

# Setting the scale of axis.
plt.tick_params(axis = "both", labelsize = 14)

plt.show()
