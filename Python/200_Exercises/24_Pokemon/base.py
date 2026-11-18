import requests
pokerequest=input("What pokemon would you like to learn? ")
pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/"+pokerequest).json()

# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer

print("Name: "+str(pokemon["name"]))
print("Height: "+str(pokemon["height"])+"ft. ")
print("Weight: "+str(pokemon["weight"])+"lbs. ")
print("Base Experience: "+str(pokemon["base_experience"]))
print("id: "+str(pokemon["id"]))