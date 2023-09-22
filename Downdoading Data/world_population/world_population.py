import json
import pygal
from pygal.style import RotateStyle
from country_code import get_country_code

# Store the data in a list.
filename = "/Users/YT/vscode/Downdoading Data/world_population/population_data.json"
with open(filename) as f:
    pop_data = json.load(f)

# Set a dictionary including populations.
cc_populations = {}
for pop_dict in pop_data:
    if pop_dict["Year"] == "2010":
        country = pop_dict["Country Name"]
        population = int(float(pop_dict["Value"]))
        code = get_country_code(country)
        if code:
            cc_populations[code] = population

# According to populations, divide countries into 3 groups.
cc_pops_1, cc_pops_2, cc_pops_3 = {}, {}, {}
for cc, pop in cc_populations.items():
    if pop < 10000000:
        cc_pops_1[cc] = pop
    elif pop < 1000000000:
        cc_pops_2[cc] = pop
    else:
        cc_pops_3[cc] = pop
print(len(cc_pops_1), len(cc_pops_2), len(cc_pops_3))
wm_style = RotateStyle("#336699")
wm = pygal.maps.world.World(style = wm_style)
wm.title = "World Population in 2010, by Country"
wm.add("0-10m", cc_pops_1)
wm.add("10m-1bn", cc_pops_2)
wm.add(">10bn", cc_pops_3)
wm.render_to_file("world_population.svg")
