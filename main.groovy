//
def url = new URL(
    'https://api.open-meteo.com/v1/forecast?latitude=54.69&longitude=25.28&current=temperature_2m'
)

def rawJson = url.text

println rawJson
