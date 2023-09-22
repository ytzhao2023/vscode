from pygal_maps_world.i18n import COUNTRIES

def get_country_code(country_name):
    """According to pointed countries, return the country code."""
    for code, name in COUNTRIES.items():
        if name == country_name:
            return code
    # If the pointed country was not found, return None.
    return None
# print(get_country_code("Andorra"))
# print(get_country_code("United Arab Emirates"))
# print(get_country_code("Afghanistan"))

# for country_code in sorted(COUNTRIES.keys()):
#    print(country_code, COUNTRIES[country_code])